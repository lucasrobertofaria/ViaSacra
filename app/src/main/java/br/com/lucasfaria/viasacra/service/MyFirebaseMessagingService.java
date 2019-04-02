package br.com.lucasfaria.viasacra.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import br.com.lucasfaria.viasacra.R;
import br.com.lucasfaria.viasacra.activity.NotificacaoActivity;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null) {
            Uri uriSom = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

            Intent notifyIntent = new Intent(this, NotificacaoActivity.class);
            notifyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                    | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            notifyIntent.setClass(this,NotificacaoActivity.class);
// Create the PendingIntent
            PendingIntent notifyPendingIntent = PendingIntent.getActivity(
                    this, 0, notifyIntent, PendingIntent.FLAG_CANCEL_CURRENT
            );

            Bitmap img = BitmapFactory.decodeResource(getResources(), R.drawable.icon_via_sacra);

            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, getString(R.string.default_notification_channel_id));
            builder.setContentTitle(remoteMessage.getNotification().getTitle())
                    .setContentText(remoteMessage.getNotification().getBody())
                    .setSmallIcon(R.drawable.icon_via_sacra)
                    .setLargeIcon(img)
                    .setSound(uriSom)
                    .setStyle(new NotificationCompat.BigTextStyle())
                    .setAutoCancel(true);
            builder.setContentIntent(notifyPendingIntent);


            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            //Verificar versão
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(getString(R.string.default_notification_channel_id), "canal", NotificationManager.IMPORTANCE_HIGH);
                notificationManager.createNotificationChannel(channel);
            }

            //Enviar Notificação
            notificationManager.notify(0, builder.build());
        }
//        super.onMessageReceived(remoteMessage);
    }

    @Override
    public void onNewToken(String s) {

        super.onNewToken(s);
        Log.i("onNewToken", s);
    }


}
