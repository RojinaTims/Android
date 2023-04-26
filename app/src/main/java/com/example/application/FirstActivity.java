package com.example.application;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {


    TextView message;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        message = findViewById(R.id.setMessage);

        //Get text from Intent
        Intent intent = getIntent();
        String getMessage = intent.getStringExtra("name");
        //Set Text
        message.setText(getMessage);

    }
}
