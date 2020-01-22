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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private TextView mon;
    private TextView mon1;
    private TextView mon2;
    private TextView mon3;
    private TextView mon4;
    private TextView mon5;

    private TextView tues;
    private TextView tues1;
    private TextView tues2;
    private TextView tues3;
    private TextView tues4;
    private TextView tues5;

    private TextView wend;
    private TextView wend1;
    private TextView wend2;
    private TextView wend3;
    private TextView wend4;
    private TextView wend5;

    private TextView thurs;
    private TextView thurs1;
    private TextView thurs2;
    private TextView thurs3;
    private TextView thurs4;
    private TextView thurs5;

    private TextView fri;
    private TextView fri1;
    private TextView fri2;
    private TextView fri3;
    private TextView fri4;
    private TextView fri5;

    private static final int REQUEST_DATA =4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView textview1 = findViewById(R.id.text1);
        TextView textview2 = findViewById(R.id.text2);
        TextView textview3 = findViewById(R.id.text3);
        TextView textview4 = findViewById(R.id.text4);
        TextView textview5 = findViewById(R.id.text5);
        TextView textview6 = findViewById(R.id.text6);
        TextView textview7 = findViewById(R.id.text7);
        TextView textview8 = findViewById(R.id.text8);
        TextView textview9 = findViewById(R.id.text9);
        TextView textview10 = findViewById(R.id.text10);

        TextView textview11 = findViewById(R.id.text11);
        TextView textview12= findViewById(R.id.text12);
        TextView textview13= findViewById(R.id.text13);
        TextView textview14 = findViewById(R.id.text14);
        TextView textview15= findViewById(R.id.text15);
        TextView textview16= findViewById(R.id.text16);
        TextView textview17= findViewById(R.id.text17);
        TextView textview18= findViewById(R.id.text18);
        TextView textview19= findViewById(R.id.text19);
        TextView textview20= findViewById(R.id.text20);

        TextView textview21 = findViewById(R.id.text21);
        TextView textview22 = findViewById(R.id.text22);
        TextView textview23 = findViewById(R.id.text23);
        TextView textview24 = findViewById(R.id.text24);
        TextView textview25 = findViewById(R.id.text25);






        View.OnClickListener listener = v -> {
            Intent intent = new Intent(MainActivity.this,SubActivity.class);
            startActivityForResult(intent,REQUEST_DATA);

        };


/*


        switch (v.getId()) {
            case R.id.text1:

                break;
            case R.id.text2:
                textview2.setText(str);
                break;
        }
        //データ送信
        intent1.putExtra("EXTRA_DATA", str);
        startActivity(intent1);
*/
        textview1.setOnClickListener(listener);
        textview2.setOnClickListener(listener);
        textview3.setOnClickListener(listener);
        textview4.setOnClickListener(listener);
        textview5.setOnClickListener(listener);
        textview6.setOnClickListener(listener);
        textview7.setOnClickListener(listener);
        textview8.setOnClickListener(listener);
        textview9.setOnClickListener(listener);
        textview10.setOnClickListener(listener);

        textview11.setOnClickListener(listener);
        textview12.setOnClickListener(listener);
        textview13.setOnClickListener(listener);
        textview14.setOnClickListener(listener);
        textview15.setOnClickListener(listener);
        textview16.setOnClickListener(listener);
        textview17.setOnClickListener(listener);
        textview18.setOnClickListener(listener);
        textview19.setOnClickListener(listener);
        textview20.setOnClickListener(listener);

        textview21.setOnClickListener(listener);
        textview22.setOnClickListener(listener);
        textview23.setOnClickListener(listener);
        textview24.setOnClickListener(listener);
        textview25.setOnClickListener(listener);






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
                String Mon = mon.getText().toString();
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
                //火曜日
                tues = findViewById(R.id.textView41);
                String Tues = tues.getText().toString();
                tues1 = findViewById(R.id.text2);
                String text6 =  tues1.getText().toString();
                tues2 = findViewById(R.id.text7);
                String text7 =  tues2.getText().toString();
                tues3 = findViewById(R.id.text12);
                String text8 =  tues3.getText().toString();
                tues4 = findViewById(R.id.text17);
                String text9 =  tues4.getText().toString();
                tues5 = findViewById(R.id.text22);
                String text10 =  tues5.getText().toString();
                  //水曜日
                wend = findViewById(R.id.textView42);
                String Wend = wend.getText().toString();
                wend1 = findViewById(R.id.text3);
                String text11 =  wend1.getText().toString();
                wend2 = findViewById(R.id.text8);
                String text12 =  wend2.getText().toString();
                wend3 = findViewById(R.id.text13);
                String text13 =  wend3.getText().toString();
                wend4 = findViewById(R.id.text18);
                String text14 =  wend4.getText().toString();
                wend5 = findViewById(R.id.text23);
                String text15 =  wend5.getText().toString();
                //木曜日
                thurs = findViewById(R.id.textView43);
                String Thurs = thurs.getText().toString();
                thurs1 = findViewById(R.id.text4);
                String text16 =  thurs1.getText().toString();
                thurs2 = findViewById(R.id.text9);
                String text17 =  thurs2.getText().toString();
                thurs3 = findViewById(R.id.text14);
                String text18 =  thurs3.getText().toString();
                thurs4 = findViewById(R.id.text19);
                String text19 =  thurs4.getText().toString();
                thurs5 = findViewById(R.id.text24);
                String text20 =  thurs5.getText().toString();
                //金曜日
                fri = findViewById(R.id.textView44);
                String Fri = fri.getText().toString();
                fri1 = findViewById(R.id.text5);
                String text21 =  fri1.getText().toString();
                fri2 = findViewById(R.id.text10);
                String text22 =  fri2.getText().toString();
                fri3 = findViewById(R.id.text15);
                String text23 =  fri3.getText().toString();
                fri4 = findViewById(R.id.text20);
                String text24 =  fri4.getText().toString();
                fri5 = findViewById(R.id.text25);
                String text25 =  thurs5.getText().toString();

                // 通知のアイコン
                builder.setSmallIcon(android.R.drawable.ic_dialog_info);

/*
                // 通知のタイトル
                builder.setContentTitle("時間割: "+Mon+"曜日");
                // 通知の内容
                builder.setContentText(text1+" | "+text2+" | "+text3+" | "+text4+" | "+text5);
*/




                //曜日を取得する
                Calendar calender = Calendar.getInstance();

                String title = null;
                String memo = null;
                switch (calender.get(Calendar.DAY_OF_WEEK)) {
                    case 2:
                        title = "時間割: " + Mon + "曜日";
                        memo = text1 + " | " + text2 + " | " + text3 + " | " + text4 + " | " + text5;
                        break;
                    case 3:
                        title = "時間割: " + Tues + "曜日";
                        memo = text6 + " | " + text7 + " | " + text8 + " | " + text9 + " | " + text10;
                        break;
                    case 4:
                        title = "時間割: "+Wend+"曜日";
                        memo = text11+" | "+text12+" | "+text13+" | "+text14+" | "+text15;
                        break;
                    case 5:
                        title = "時間割: "+Thurs+"曜日";
                        memo =  text16+" | "+text17+" | "+text18+" | "+text19+" | "+text20;
                        break;
                    case 6:
                        title = "時間割: "+Fri+"曜日";
                        memo = text21+" | "+text22+" | "+text23+" | "+text24+" | "+text25;
                        break;

                }
                //通知のタイトル
                builder.setContentTitle(title);
                // 通知の内容
                builder.setContentText(memo);

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
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        TextView textview1 = findViewById(R.id.text1);
        switch(requestCode) {
            case(REQUEST_DATA):
                if(resultCode == RESULT_OK){
                   textview1.setText(data.getStringExtra("edit1"));
                }else if(resultCode == RESULT_CANCELED){
                    //キャンセルボタンを押して戻ってきたときの処理
                }else{
                    //その他
                }
                break;
            default:
                break;
        }
    }
}

