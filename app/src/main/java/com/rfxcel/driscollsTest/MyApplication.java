package com.rfxcel.driscollsTest;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodChannel;

public class MyApplication extends Application {

    public static FlutterEngine flutterEngine;
    public static MethodChannel methodChannel;
    public static final String NAME = "FlutterModuleRn";


    @Override
    public void onCreate() {
        super.onCreate();

        // Instantiate a FlutterEngine.
        flutterEngine = new FlutterEngine(this);

        // Start executing Dart code to pre-warm the FlutterEngine.
        flutterEngine.getDartExecutor().executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
        );

        // Cache the FlutterEngine to be used by FlutterActivity.
        FlutterEngineCache
                .getInstance()
                .put(NAME, flutterEngine);

        methodChannel = new MethodChannel(MyApplication.flutterEngine.getDartExecutor(),"com.scandit.fluttermodule");


    }
}
