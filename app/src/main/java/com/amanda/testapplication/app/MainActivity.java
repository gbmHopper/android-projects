package com.amanda.testapplication.app;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static final String KEY = "com.amanda.testapplication.incCount";
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

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        int incCount = sharedPreferences.getInt(KEY,0 );
        text.setText(incCount+"");

    }

    public void buttonClick(View view) {
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY,sharedPreferences.getInt(KEY, 0) + 1 );

        text.setText(String.format("The current count is %d", sharedPreferences.getInt(KEY, 0)));
        editor.commit();
    }
}
