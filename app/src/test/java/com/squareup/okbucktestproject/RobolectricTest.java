package com.squareup.okbucktestproject;

import android.content.ComponentName;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(BuckRobolectricTestRunner.class) //
public class RobolectricTest {
  private static final String BIKESHOP_PACKAGE = "com.bikeshop";
  private static final ComponentName CALLING_ACTIVITY =
      new ComponentName(BIKESHOP_PACKAGE, "com.bikeshop.BikeActivity");

  @Test public void test() {
  }
}
