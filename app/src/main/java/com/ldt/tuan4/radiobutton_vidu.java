package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class radiobutton_vidu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton_vidu);
        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.bg);
        bg.setBackgroundResource(R.drawable.bg1);
        RadioGroup radioGroup = (RadioGroup)
                findViewById(R.id.radioGroup1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedRadioId) {
//                switch (checkedRadioId) {
//                    case R.id.radioButton:
//                        bg.setBackgroundResource(R.drawable.bg1);
//                        break;
//                    case 2:
//                        bg.setBackgroundResource(R.drawable.bg2);
//                        break;
//                }
                if (checkedRadioId==R.id.radioButton){
                    bg.setBackgroundResource(R.drawable.bg1);
                }
                else if (checkedRadioId==R.id.radioButton2) {
                    bg.setBackgroundResource(R.drawable.bg2);
                }
            }
        });
    }
}