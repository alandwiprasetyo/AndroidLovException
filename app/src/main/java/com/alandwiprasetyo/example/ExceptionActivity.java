package com.alandwiprasetyo.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alandwiprasetyo on 10/20/16.
 */

public class ExceptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exception);
        TextView tvMessage = (TextView) findViewById(R.id.tvMessage);
        TextView tvFullMessage = (TextView) findViewById(R.id.tvFullMessage);
        Intent intent = getIntent();
        tvMessage.setText(intent.getStringExtra("message"));
        tvFullMessage.setText(intent.getStringExtra("exception"));
    }
}
