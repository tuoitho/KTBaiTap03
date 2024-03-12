package com.ldt.tuan4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class menu_vidu extends AppCompatActivity {

    Button btnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_vidu);
        btnButton = (Button) findViewById(R.id.button);
        btnButton.setOnClickListener(v -> {
            ShowPopupMenu();
        });
        //đăng ký view cho context menu trong onCreate
        registerForContextMenu(btnButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuSetting) {
            //Xử lý sự kiện
        } else if (item.getItemId() == R.id.menuShare) {
            //Xử lý sự kiện
        } else if (item.getItemId() == R.id.menuLogout) {
            //Xử lý sự kiện
        }
        return super.onOptionsItemSelected(item);
    }

    //popup menu
    private void ShowPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, btnButton);
        popupMenu.getMenuInflater().inflate(R.menu.menu_setting, popupMenu.getMenu());
//bắt sự kiện
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.menuSetting) {
                    //Xử lý sự kiện
                    btnButton.setText("Setting");
                    Toast.makeText(menu_vidu.this, "Bạn đang chọn Setting", Toast.LENGTH_LONG).show();
                } else if (item.getItemId() == R.id.menuShare) {
                    //Xử lý sự kiện
                    btnButton.setText("Chia sẻ");
                    Toast.makeText(menu_vidu.this, "Bạn đang chọn Chia sẻ", Toast.LENGTH_LONG).show();
                } else if (item.getItemId() == R.id.menuLogout) {
                    //Xử lý sự kiện
                    btnButton.setText("Đăng xuất");
                    Toast.makeText(menu_vidu.this, "Bạn đang chọn Đăng xuất", Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });
        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        menu.setHeaderTitle("Context Menu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    //bắt sự kiện Context Menu
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuSetting) {
            //Xử lý sự kiện
            btnButton.setText("Setting");
            Toast.makeText(menu_vidu.this, "Bạn đang chọn Setting", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.menuShare) {
            //Xử lý sự kiện
            btnButton.setText("Chia sẻ");
            Toast.makeText(menu_vidu.this, "Bạn đang chọn Chia sẻ", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.menuLogout) {
            //Xử lý sự kiện
            btnButton.setText("Đăng xuất");
            Toast.makeText(menu_vidu.this, "Bạn đang chọn Đăng xuất", Toast.LENGTH_LONG).show();
        }

        return super.onContextItemSelected(item);
    }
}