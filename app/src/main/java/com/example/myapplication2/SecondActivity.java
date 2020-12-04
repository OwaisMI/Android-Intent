package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("Key")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String newString = (String) getIntent().getExtras().getString("Key");
            tv.setText(newString);
        }
    }
}