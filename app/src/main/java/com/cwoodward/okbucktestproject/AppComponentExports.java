package com.cwoodward.okbucktestproject;

import android.app.Activity;
import java.util.Map;

public interface AppComponentExports {
  Map<Class<? extends Activity>, Class<?>> componentByActivity();
}
