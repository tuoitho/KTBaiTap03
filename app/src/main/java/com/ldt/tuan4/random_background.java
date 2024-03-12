package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class random_background extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_background);
        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout1);
//        bg.setBackgroundColor(Color.BLUE);
        bg.setBackgroundResource(R.drawable.bg1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.bg1);
        arrayList.add(R.drawable.bg2);
        arrayList.add(R.drawable.bg3);
        arrayList.add(R.drawable.bg4);
        arrayList.add(R.drawable.bg5);
        Random random = new Random();
        int vitri = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(vitri));
    }
}