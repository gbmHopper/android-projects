package com.amanda.testapplication.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int increment = 0;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        text = (TextView) findViewById(R.id.display);
    }

    public void buttonClick(View view) {
        increment++;
        text.setText(increment+"");

    }
}
