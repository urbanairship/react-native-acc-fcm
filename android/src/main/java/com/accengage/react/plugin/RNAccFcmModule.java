
package com.accengage.react.plugin;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNAccFcmModule extends ReactContextBaseJavaModule {

  private static ReactApplicationContext mReactContext;

  public RNAccFcmModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.mReactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAccFcm";
  }
}