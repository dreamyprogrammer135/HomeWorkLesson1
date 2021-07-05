package com.dreamyprogrammer.homeworklesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.simple_button).setOnClickListener(v -> {
            Toast.makeText(this,getString(R.string.hello), Toast.LENGTH_LONG).show();
        });

    }
}