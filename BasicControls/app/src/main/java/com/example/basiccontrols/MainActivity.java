package com.example.basiccontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.basiccontrols.R.id;
import com.example.basiccontrols.customcontrols.ItemView;

public class MainActivity extends AppCompatActivity {
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* 登录按钮设置点击事件*/
        btLogin=findViewById(R.id.bt_login);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });
           }
}