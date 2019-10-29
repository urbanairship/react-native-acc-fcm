
package com.accengage.react.plugin;

import android.content.Context;
import android.util.Log;

import com.ad4screen.sdk.A4SService;
import com.ad4screen.sdk.Constants;
import com.ad4screen.sdk.plugins.BasePlugin;
import com.ad4screen.sdk.plugins.FCMPlugin;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.ad4screen.sdk.A4S;

import java.util.Locale;

import okhttp3.internal.Util;


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