package com.example.timeschedule;


import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


public class MainActivity extends AppCompatActivity {

    private TextView mon;
    private TextView mon1;
    private TextView mon2;
    private TextView mon3;
    private TextView mon4;
    private TextView mon5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview1 = findViewById(R.id.text1);
        textview1.setOnClickListener((View v) -> {
                startActivity(new Intent(this, SubActivity.class));

            });

        TextView textview2 = findViewById(R.id.text2);
        textview2.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });

        TextView textview3 = findViewById(R.id.text3);
        textview3.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview4 = findViewById(R.id.text4);
        textview4.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview5 = findViewById(R.id.text5);
        textview5.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview6 = findViewById(R.id.text6);
        textview6.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview7 = findViewById(R.id.text7);
        textview7.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview8 = findViewById(R.id.text8);
        textview8.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview9 = findViewById(R.id.text9);
        textview9.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview10 = findViewById(R.id.text10);
        textview10.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview11 = findViewById(R.id.text11);
        textview11.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview12 = findViewById(R.id.text12);
        textview12.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview13 = findViewById(R.id.text13);
        textview13.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview14 = findViewById(R.id.text14);
        textview14.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview15 = findViewById(R.id.text15);
        textview15.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview16 = findViewById(R.id.text16);
        textview16.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview17 = findViewById(R.id.text17);
        textview17.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview18 = findViewById(R.id.text18);
        textview18.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview19 = findViewById(R.id.text16);
        textview19.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview20 = findViewById(R.id.text20);
        textview20.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview21 = findViewById(R.id.text21);
        textview21.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview22 = findViewById(R.id.text22);
        textview22.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview23 = findViewById(R.id.text23);
        textview23.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview24 = findViewById(R.id.text24);
        textview24.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });
        TextView textview25 = findViewById(R.id.text25);
        textview25.setOnClickListener((View v) -> {
            startActivity(new Intent(this, SubActivity.class));

        });


        findViewById(R.id.toSub1Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 通知を作成するビルダーの生成
                NotificationCompat.Builder builder = new NotificationCompat.Builder(
                        MainActivity.this,
                        "MyChannel_Id");

                //その日のデータを取得
                //月曜日のデータ取得
                mon = findViewById(R.id.textView40);
                String text = mon.getText().toString();
                mon1 = findViewById(R.id.text1);
                String text1 =  mon1.getText().toString();
                mon2 = findViewById(R.id.text6);
                String text2 =  mon2.getText().toString();
                mon3 = findViewById(R.id.text11);
                String text3 =  mon3.getText().toString();
                mon4 = findViewById(R.id.text16);
                String text4 =  mon4.getText().toString();
                mon5 = findViewById(R.id.text21);
                String text5 =  mon5.getText().toString();

                // 通知のアイコン
                builder.setSmallIcon(android.R.drawable.ic_dialog_info);

                // 通知のタイトル

                builder.setContentTitle("時間割: "+text+"曜日");

                // 通知の内容
                builder.setContentText(text1+" | "+text2+" | "+text3+" | "+text4+" | "+text5);

                // 通知をタップした際にアクティビティを起動する
                // --- ここを削除すると通知の表示のみとなる
                Intent intent = new Intent(MainActivity.this,NotificationActivity.class);
                intent.putExtra("DATA","通知から起動されました。");

                PendingIntent pen = PendingIntent.getActivity(MainActivity.this,
                        0, // 0は識別子。何でも良い
                        intent,
                        PendingIntent.FLAG_CANCEL_CURRENT);  // オブジェクトを再生成
                builder.setContentIntent(pen);
                builder.setAutoCancel(true);
                // --- ここを削除すると通知の表示のみとなる

                // 通知の作成
                Notification notification = builder.build();

                // 通知サービスで通知を実行する
                NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0, notification); // 0は識別子。何でも良い
            }
        });




        }


}