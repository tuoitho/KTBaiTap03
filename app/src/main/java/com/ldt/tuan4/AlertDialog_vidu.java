package com.ldt.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

public class AlertDialog_vidu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_vidu);
        Button btnThoat = (Button) findViewById(R.id.button2);
        btnThoat.setOnClickListener(v -> {
            XacNhanXoa();
        });
    }
    private void XacNhanXoa(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Thông báo");
        alert.setMessage("Bạn có muốn thoát app không");
        alert.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//lệnh nút có
                finish();
            }
        });
        alert.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//lệnh nút không
                dialog.cancel();
            }
        });
        alert.show();
    }
}