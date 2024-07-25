package com.rfxcel.driscollsTest;

import static com.rfxcel.driscollsTest.MyApplication.NAME;
import static com.rfxcel.driscollsTest.MyApplication.methodChannel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton btFlutterOpen = findViewById(R.id.bt_hello);

        btFlutterOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Map<String, Object> map = new HashMap<String, Object>();
                map.put("instance","scandit");
                map.put("user","70eec18f");
                map.put("logout",false);
                JSONObject obj=new JSONObject(map);

                methodChannel.invokeMethod("instance_rfxcel", obj.toString(), new MethodChannel.Result() {
                    @Override
                    public void success(@Nullable Object result) {
                        Log.d("Gateway_json ANDROID: ","ANDROID Success : "+obj.toString());
                    }

                    @Override
                    public void error(@NonNull String errorCode, @Nullable String errorMessage, @Nullable Object errorDetails) {
                        Log.d("Gateway_json ANDROID: ","ANDROID Error : Error Code - "+errorCode +", Error Message : "+errorMessage+", Error Message : "+errorDetails.toString());
                    }

                    @Override
                    public void notImplemented() {
                        Log.d("Gateway_json ANDROID: ","ANDROID Error : notImplemented");

                    }
                });

                startActivity(FlutterActivity.withCachedEngine(NAME).build(getApplicationContext()));
            }
        });
    }
}
