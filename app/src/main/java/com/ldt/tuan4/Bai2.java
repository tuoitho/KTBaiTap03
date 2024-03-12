package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Switch;

public class Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        ConstraintLayout cl = findViewById(R.id.b2);
        Switch sw = findViewById(R.id.switch2);
        sw.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                cl.setBackgroundResource(R.drawable.bg1);
            } else {
                cl.setBackgroundResource(R.drawable.bg2);
            }
        });
    }
}