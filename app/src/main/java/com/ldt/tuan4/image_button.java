package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class image_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        ImageView img1 = (ImageView)findViewById(R.id.imageView1);
        ImageButton img2 = (ImageButton)findViewById(R.id.imageButton1);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.btn_arrow2);
                img1.getLayoutParams().width=550;
                img1.getLayoutParams().height=550;
            }
        });
    }
}