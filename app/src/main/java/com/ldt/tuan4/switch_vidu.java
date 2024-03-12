package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class switch_vidu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_vidu);
        Switch sw = (Switch) findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) { //isChecked = true
                    Toast.makeText(switch_vidu.this, "Switch đang bật", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(switch_vidu.this, "Switch đang tắt", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}