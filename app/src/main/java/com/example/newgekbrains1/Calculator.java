package com.example.newgekbrains1;

import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Calculator implements Serializable {
    List <Integer> listWNum;
    List <Integer> listWSym;

    public Calculator(List<Integer> listWNum, List<Integer> listWSym) {
        this.listWNum = listWNum;
        this.listWSym = listWSym;
    }
    public void sum(){
        for (int i = 0; i < listWSym.size(); i++) {
            if(listWSym.get(i)==1){
                int a1 = listWNum.get(i);
                int a2 = listWNum.get(i+1);
                int a = listWNum.get(i)+listWNum.get(i+1);
                listWNum.set(i, a);
                listWNum.remove(i+1);
                    break;
            }
        }
    }
    public void sub(){
        for (int i = 0; i < listWSym.size(); i++) {
            if(listWSym.get(i)==2){
                int a1 = listWNum.get(i);
                int a2 = listWNum.get(i+1);
                int a = listWNum.get(i)-listWNum.get(i+1);
                listWNum.set(i, a);
                listWNum.remove(i+1);
                    break;
            }
        }
    }
    public void mul(){
        for (int i = 0; i < listWSym.size(); i++) {
            if(listWSym.get(i)==3){
                int a1 = listWNum.get(i);
                int a2 = listWNum.get(i+1);
                int a = listWNum.get(i)*listWNum.get(i+1);
                listWNum.set(i, a);
                listWNum.remove(i+1);
                    break;
            }
        }
    }
    public void div(){
        for (int i = 0; i < listWSym.size(); i++) {
            if(listWSym.get(i)==4){
                int a1 = listWNum.get(i);
                int a2 = listWNum.get(i+1);
                int a = listWNum.get(i)/listWNum.get(i+1);
                listWNum.set(i, a);
                listWNum.remove(i+1);
                    break;
            }
        }
    }
    public void equally(EditText editText, TextView textView){
        textView.setText(String.valueOf(listWNum.get(0)));
        editText.setText("");
        listWNum.clear();
        listWSym.clear();
    }

}
