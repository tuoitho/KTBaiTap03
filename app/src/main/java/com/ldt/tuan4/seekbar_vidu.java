package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class seekbar_vidu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_vidu);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        //change icon
        seekBar.setThumb(getDrawable(R.drawable.like));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//progress: giá trị của seekbar
                Log.d("AAA","Giá trị:" + progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Start");
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Stop");
            }});
    }
}