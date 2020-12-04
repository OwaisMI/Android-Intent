package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button HelloBtn = (Button) findViewById(R.id.Hello);
        HelloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent show = new Intent(getApplicationContext(), SecondActivity.class);
                show.putExtra("Key","Hello World");
                startActivity(show);
            }
        });
        Button GoogleBtn = (Button) findViewById(R.id.Google);
        GoogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address = Uri.parse("https://www.google.com/");
                Intent Google = new Intent(Intent.ACTION_VIEW, address);
                startActivity(Google);
            }
        });
    }
}