
package com.bsimvideobanking;

import android.app.Application;
import com.alicecallsbob.assist.sdk.core.AssistListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
public class LibraryTrial extends ReactContextBaseJavaModule{

  private static final String DURATION_SHORT_KEY = "3";
  private static final String DURATION_LONG_KEY = "10";

  public LibraryTrial(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "LibraryTrial";
  }

  @ReactMethod
  public Integer add(Integer a, Integer b) {
    int result = a + b;
    return (Integer) result;
  }

  @ReactMethod
  public void addWithPromise(Integer a, Integer b, Promise promise) {
    promise.resolve(a + b);
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, 5);
    constants.put(DURATION_LONG_KEY, 10);
    return constants;
  }
}