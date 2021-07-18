package com.example.newgekbrains1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;
    private TextView ResultField;
    private EditText CalculationField;
    private EditText HideFiled;

    List <Integer> numbers = new ArrayList();
    List <Integer> symbols = new ArrayList();

    public static final String JANGO = "JANGO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ResultField = findViewById(R.id.result);
        CalculationField = findViewById(R.id.numbers1);
        HideFiled = findViewById(R.id.numbers2);
        Buttons();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(JANGO,calculator);
    }

    public void Buttons(){
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOnClick(v);
            }
        });
        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symOnClick(v);
                result();
            }
        });
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symOnClick(v);
                symbols.add(1);
            }
        });
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symOnClick(v);
                symbols.add(2);
            }
        });
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symOnClick(v);
                symbols.add(3);
            }
        });
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symOnClick(v);
                symbols.add(4);
            }
        });
    }
    public void numOnClick(View view){
        Button button = (Button) view;
        CalculationField.append(button.getText());
        HideFiled.append(button.getText());


    }
    public void symOnClick(View view){
        Button button = (Button) view;
        CalculationField.append(button.getText());
        numbers.add(Integer.parseInt(HideFiled.getText().toString()));
        HideFiled.setText("");
    }

    public void result(){
        calculator = new Calculator(numbers,symbols);
        if(symbols.size()>1){
            if(symbols.contains(3) || symbols.contains(4)){
                for (int i = 0; i < symbols.size(); i++) {
                    if (symbols.get(i)==3){
                        calculator.mul();
                    } else if (symbols.get(i)==4){
                        calculator.div();
                    }

                }
            }
            else if(symbols.contains(1) || symbols.contains(2)){
                for (int i = 0; i < symbols.size(); i++) {
                    if (symbols.get(i)==1){
                        calculator.sum();
                    } else if (symbols.get(i)==2){
                        calculator.sub();
                    }
                }
            }
        }
        if(symbols.get(0)==1){
            calculator.sum();
        }
        else if(symbols.get(0)==2){
            calculator.sub();
        }
        else if(symbols.get(0)==3){
            calculator.mul();
        }
        else if(symbols.get(0)==4){
            calculator.div();
        }
        calculator.equally(CalculationField, ResultField);
    }

}


