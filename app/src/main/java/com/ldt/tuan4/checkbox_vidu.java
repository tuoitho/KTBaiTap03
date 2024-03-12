package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class checkbox_vidu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_vidu);
        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.bg);
        bg.setBackgroundResource(R.drawable.bg2);
        CheckBox ck1 = (CheckBox) findViewById(R.id.checkBox);
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    bg.setBackgroundResource(R.drawable.bg1);
                } else {
                    bg.setBackgroundResource(R.drawable.bg2);
                }
            }
        });
    }
}