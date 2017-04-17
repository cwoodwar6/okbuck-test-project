package com.cwoodward.okbucktestproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    Button button = (Button) findViewById(R.id.app_button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
      }
    });
  }
}
