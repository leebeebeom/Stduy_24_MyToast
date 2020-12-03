package com.example.a24_mytoast;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_toast).setOnClickListener(v -> {
            MyToast.makeText(this, "뉴 토스트", Toast.LENGTH_SHORT).show();
        });

    }
}