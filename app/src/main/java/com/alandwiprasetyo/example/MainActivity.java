package com.alandwiprasetyo.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alandwiprasetyo.androidlovexception.AndroidLovException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLovException.init(this);
//        AndroidLovException.init(this, ExceptionActivity.class);

        setContentView(R.layout.activity_main);

    }

//    public void errorAction(View view) {
//
//    }
}
