package com.example.timeschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        //わかりやすいようにタイトル変更しておく
        setTitle("時間割");

        Intent intent = getIntent();
        String data = intent.getStringExtra("Data");

        TextView tv = findViewById(R.id.textView);

        //通知から起動された場合
        if(data != null){
            tv.setText(data);
        }else {
            tv.setText("ボタンから起動しました。");
        }

    }
}
