package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class progressbar_vidu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar_vidu);
        //imageview
        ImageView img1 = (ImageView) findViewById(R.id.imageView);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//tự đếm progress
                CountDownTimer countDownTimer = new CountDownTimer(3000, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int current = progressBar.getProgress();
//chạy đều đều >100 quay về 0
                        if (current >= progressBar.getMax()) {
                            current = 0;
                            progressBar.setProgress(0);
                        }
                        progressBar.setProgress(current + 10); //thiết lập progress
                    }
                    @Override
                    public void onFinish() {
                        Toast.makeText(progressbar_vidu.this, "Đã hết thời gian", Toast.LENGTH_SHORT).show();
                    }
                };
                countDownTimer.start();
            }
        });
    }
}