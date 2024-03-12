package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bai1 extends AppCompatActivity {
    private Integer[] backgroundImages = {
            R.drawable.bg1,
            R.drawable.bg2,
            R.drawable.bg3,
            R.drawable.bg4,
            R.drawable.bg5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Integer[] bgs = backgroundImages;
        //set ngau nhien hinh nen 
        int index = (int) (Math.random() * bgs.length);
        findViewById(R.id.b1).setBackgroundResource(bgs[index]);

    }
}