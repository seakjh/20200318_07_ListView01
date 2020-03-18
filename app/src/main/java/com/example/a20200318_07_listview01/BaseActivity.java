package com.example.a20200318_07_listview01;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

//abstract 메소드를 가지는 클래스는 반드시 abstract class
public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();

}
