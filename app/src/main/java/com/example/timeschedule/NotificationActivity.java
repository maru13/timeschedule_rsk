package com.example.timeschedule;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import java.util.Calendar;

public class NotificationActivity extends BroadcastReceiver {
    public  final String TAG = NotificationActivity.class.getName();


    @Override
    public void onReceive(Context context, Intent intent1) {
            String data1 = intent1.getStringExtra("tiName1");
            String data2 = intent1.getStringExtra("meName1");
            //通知がクリックされた時に発行されるIntentの生成
            Intent sendIntent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, sendIntent, 0);

            //通知オブジェクトの生成
            Notification noti = new NotificationCompat.Builder(context)
                    .setTicker("お時間ですよ!")
                    .setContentTitle(data1)
                    .setContentText(data2)
                    .setSmallIcon(android.R.drawable.ic_dialog_info)
                    .setVibrate(new long[]{0, 200, 100, 200, 100, 200})
                    .setAutoCancel(true)
                    .setContentIntent(pendingIntent)
                    .build();

            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, noti);
    }



}
