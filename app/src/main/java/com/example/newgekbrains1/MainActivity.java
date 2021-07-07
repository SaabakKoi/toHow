package com.example.newgekbrains1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.switch2).setOnClickListener(v -> {
            Toast.makeText(this, "Here you go", Toast.LENGTH_SHORT).show();
        });

    }
}