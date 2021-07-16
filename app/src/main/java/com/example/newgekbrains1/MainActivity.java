package com.example.newgekbrains1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView NUMBERS;
    private int num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NUMBERS = findViewById(R.id.numbers1);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUMBERS.setText(String.valueOf(2));
            }
        });

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBottom1();
            }
        });

        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUMBERS.setText(String.valueOf(num1+"+"));
            }
        });

        };
    public void onBottom1(){
        NUMBERS.setText(String.valueOf(1));
        num1 = 1;
    }

    public void getNum1(){

    }
    }
