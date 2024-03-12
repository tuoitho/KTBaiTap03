package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

public class backgroundlayout_vd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_layout_vd);
        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout1);
//        bg.setBackgroundColor(Color.BLUE);
        bg.setBackgroundResource(R.drawable.bg4);

    }
}