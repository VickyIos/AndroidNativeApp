# Android Native App

As you can see, this is our parent app, where we integrate our aar file into this Native app. Let's see the steps to integrate arr file into an Android Native app 

## Steps to be followed

1.Maven URL(Setting.gradle)
<img width="1120" alt="Step 1 - Maven URL(Setting gradle)" src="https://github.com/VickyIos/AndroidNativeApp/assets/20942319/ebe69c17-075b-4623-bebf-07496b01a266">

2.Maven URL(Project)
<img width="1209" alt="Step 2 - Maven URL(Project)" src="https://github.com/VickyIos/AndroidNativeApp/assets/20942319/09b9e3b9-cbed-47a5-9bdd-87e8c8a4c530">

3.Update Dependencies
<img width="1094" alt="Step 3 - Update Dependencies " src="https://github.com/VickyIos/AndroidNativeApp/assets/20942319/b6d48003-b6cc-4d8f-b065-50ad484d31fa">

4.Sync up the project
<img width="1408" alt="Step 4 - Sync up the project" src="https://github.com/VickyIos/AndroidNativeApp/assets/20942319/d3a9566f-f780-4cf7-aaad-045d279a4c4a">

5.Run your app and tap on "CLICK TO OPEN FLUTTER MODULE"

Expected:
This will navigate to our Flutter module which displays Instance and Username values which we are passing from Android Native App.

Result:
This navigates to Black screen with the following error.

```
Error:
E/flutter: [ERROR:flutter/runtime/dart_vm_initializer.cc(41)] Unhandled Exception: MissingPluginException(No implementation found for method getDefaults on channel com.scandit.datacapture.core/method_channel)
#0 MethodChannel._invokeMethod (package:flutter/src/services/platform_channel.dart:332:7)
<asynchronous suspension>
#1 Defaults.initializeDefaultsAsync (package:scandit_flutter_datacapture_core/src/defaults.dart:282:21)
<asynchronous suspension>
#2 ScanditFlutterDataCaptureBarcode.initialize (package:scandit_flutter_datacapture_barcode/src/scandit_flutter_datacapture_barcode.dart:21:5)
<asynchronous suspension>
#3 main (package:flutter_module_sam/main.dart:8:3)
<asynchronous suspension>
```
Error:
<img width="1099" alt="Screenshot 2024-06-27 at 5 34 09 PM" src="https://github.com/VickyIos/AndroidNativeApp/assets/20942319/7c979b4d-2dca-4559-aeaa-628dc4bb5015">

