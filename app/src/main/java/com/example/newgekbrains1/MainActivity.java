package com.example.newgekbrains1;

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

    private EditText NUMBERS;
    private EditText NUMBERS2;
    private TextView RESULT;
    private String number;
    private int correctNum;
    private int a;
    private int b;
    private int c = 0;

    private int TYPESYMBOL = 0;

    List<String> list = new ArrayList();
    List<Integer> listWithSymbols = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NUMBERS = findViewById(R.id.numbers1);
        NUMBERS2 = findViewById(R.id.numbers2);
        RESULT = findViewById(R.id.result);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickNum(v);

            }
        });

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickNum(v);
            }
        });
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                TYPESYMBOL = 2;
                listWithSymbols.add(02);
            }
        });
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                TYPESYMBOL = 3;
                listWithSymbols.add(03);
            }
        });
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                TYPESYMBOL = 4;
                listWithSymbols.add(04);
            }
        });


        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                GettingRes();
                NUMBERS.setText(String.valueOf(""));
//                a = list.get(0);
//                b = list.get(1);
                c = a + b;
                listWithSymbols.clear();

            }
        });

        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                TYPESYMBOL = 1;
                listWithSymbols.add(05);
            }
        });

    }

    ;

    public void ClickSymbol(View view) {
        Button button = (Button) view;
        NUMBERS.append(button.getText());
        listWithSymbols.add(correctNum);
        NUMBERS2.setText(String.valueOf(""));
//        listWithSymbols.add(button.getText().toString());

    }

    public void ClickNum(View view) {
        Button button = (Button) view;
        NUMBERS.append(button.getText());
        NUMBERS2.append(button.getText());
        try {
            number = NUMBERS2.getText().toString();
            correctNum = Integer.parseInt(number);
        } catch (NumberFormatException e) {

        }
    }

    public void GettingRes() {
        String a = NUMBERS.getText().toString();
        int b = 0;
        try {
            b = Integer.parseInt(a);
        } catch (NumberFormatException e) {

        }
        Calcing();
//        Calculate();
//        RESULT.setText(String.valueOf(listWithSymbols));
        if (TYPESYMBOL == 1) {
//            RESULT.setText(String.valueOf(listWithSymbols));
//            RESULT.setText("=" + String.valueOf(list.get(0) + list.get(1)));
//        } else if (TYPESYMBOL == 2) {
//            RESULT.setText("=" + String.valueOf(list.get(0) - list.get(1)));
//        } else if (TYPESYMBOL == 3) {
//            RESULT.setText("=" + String.valueOf(list.get(0) * list.get(1)));
//        } else if (TYPESYMBOL == 4) {
//            RESULT.setText("=" + String.valueOf(list.get(0) / list.get(1)));
//        }
    }

//    public void Calculate() {
//        while(listWithSymbols.size()!=0){
//        if (listWithSymbols.size() >= 2) {
//            for (int i = 0; i < listWithSymbols.size(); i++) {
//                if (i == 3) {
//                    RESULT.setText("=" + String.valueOf(list.get(i) * list.get(i++)));
////                    listWithSymbols.remove(i);
////                    list.remove(i);
////                    list.remove(i++);
//                    list.add( Integer.parseInt(RESULT.getText().toString()));
//                }
////                 else if (i == 4) {
////                    RESULT.setText("=" + String.valueOf(list.get(i) / list.get(i++)));
////                    listWithSymbols.remove(i);
////                    list.remove(i);
////                    list.remove(i++);
////                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
////                } else if (i == 1) {
////                    RESULT.setText("=" + String.valueOf(list.get(i) + list.get(i++)));
////                    listWithSymbols.remove(i);
////                    list.remove(i);
////                    list.remove(i++);
////                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
////                } else if (i == 2) {
////                    RESULT.setText("=" + String.valueOf(list.get(i) * list.get(i++)));
////                    listWithSymbols.remove(i);
////                    list.remove(i);
////                    list.remove(i++);
////                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
////                }
//
//            }
//        }
//        }
//        RESULT.setText(String.valueOf(listWithSymbols));
   }
   public void Calcing(){
        if(listWithSymbols.size()>0){
            for (int i = 0; i < listWithSymbols.size(); i++) {
                if (listWithSymbols.get(i)==05){
                    RESULT.setText(String.valueOf(listWithSymbols.get(i-1)+listWithSymbols.get(i++)));
                    listWithSymbols.add(Integer.parseInt(RESULT.getText().toString()));
//                    listWithSymbols.remove(i-1);
//                    listWithSymbols.remove(i++);
//                    listWithSymbols.remove(i);
                }


            }
        }
//        else {
//            RESULT.setText(String.valueOf(listWithSymbols.get(0)+listWithSymbols.get(2)));
//        }
   }
}


