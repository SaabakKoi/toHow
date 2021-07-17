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
    private int correctNum;


    List<Integer> list = new ArrayList();
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
                listWithSymbols.add(2);
            }
        });
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                listWithSymbols.add(3);
            }
        });
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                listWithSymbols.add(4);
            }
        });


        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                GettingRes();
                NUMBERS.setText(String.valueOf(""));
                list.clear();

            }
        });

        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickSymbol(v);
                listWithSymbols.add(1);
            }
        });

    }

    public void ClickSymbol(View view) {
        Button button = (Button) view;
        NUMBERS.append(button.getText());
        list.add(correctNum);
        NUMBERS2.setText(String.valueOf(""));
    }

    public void ClickNum(View view) {
        Button button = (Button) view;
        NUMBERS.append(button.getText());
        NUMBERS2.append(button.getText());
        try {
            String number = NUMBERS2.getText().toString();
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
        Calculate();
        RESULT.setText(String.valueOf(list.get(0)));

    }

    public void Calculate() {
        if (listWithSymbols.size() > 1) {
            for (int i = 0; i < listWithSymbols.size(); i++) {
                if (listWithSymbols.get(i) == 3) {
                    RESULT.setText(String.valueOf(list.get(i) * list.get(i++)));
                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
                    RESULT.setText(String.valueOf(list));
                    if(listWithSymbols.size()>1) {
                        list.remove(i - 1);
                    }
                    listWithSymbols.remove(i);

                } else if (listWithSymbols.get(i) == 4) {
                    RESULT.setText(String.valueOf(list.get(i) / list.get(i++)));
                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
                    RESULT.setText(String.valueOf(list));
                    if(listWithSymbols.size()>1) {
                        list.remove(i - 1);
                    }
                    listWithSymbols.remove(i);
                } else if (listWithSymbols.get(i) == 1) {
                    RESULT.setText(String.valueOf(list.get(i) + list.get(i++)));
                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
                    RESULT.setText(String.valueOf(list));
                    if(listWithSymbols.size()>1) {
                        list.remove(i - 1);
                    }
                    listWithSymbols.remove(i);
                } else if (listWithSymbols.get(i) == 2) {
                    RESULT.setText(String.valueOf(list.get(i) - list.get(i++)));
                    list.set(i, Integer.parseInt(RESULT.getText().toString()));
                    RESULT.setText(String.valueOf(list));
                    if(listWithSymbols.size()>1) {
                        list.remove(i - 1);
                    }
                    listWithSymbols.remove(i);
                }
                else {
                    break;
                }

            }

        }

        if (listWithSymbols.get(0) == 3) {
            try {
                RESULT.setText(String.valueOf(list.get(0) * list.get(1)));
                list.set(0, Integer.parseInt(RESULT.getText().toString()));
            } catch (IndexOutOfBoundsException e){

            }
        } else if (listWithSymbols.get(0) == 4) {
            try {
                RESULT.setText(String.valueOf(list.get(0) / list.get(1)));
                list.set(0, Integer.parseInt(RESULT.getText().toString()));
            } catch (IndexOutOfBoundsException e){

            }
        } else if (listWithSymbols.get(0) == 1) {
            try {
                RESULT.setText(String.valueOf(list.get(0) + list.get(1)));
                list.set(0, Integer.parseInt(RESULT.getText().toString()));
            }catch (IndexOutOfBoundsException e){

            }
        } else if (listWithSymbols.get(0) == 2) {
            try {
                RESULT.setText(String.valueOf(list.get(0) - list.get(1)));
                list.set(0, Integer.parseInt(RESULT.getText().toString()));
            }catch (IndexOutOfBoundsException e){

            }
        }
    }

}


