package com.cwoodward.library;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.squareup.app_library.R;

public class TestActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.test_activity);
    Button button = (Button) findViewById(R.id.test_button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent(TestActivity.this, TestActivity.class);
        startActivity(intent);
      }
    });
  }
}
