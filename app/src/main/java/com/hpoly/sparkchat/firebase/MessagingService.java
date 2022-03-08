package com.hpoly.sparkchat.firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {


    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        // printing token in order to check whether Firebase cloud messaging is set up correctly or not
        // Log.d("FCM","Token: " + token);
    }


    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        // printing remote message in order to check whether Firebase cloud messaging is set up correctly or not
        // Log.d("FCM","Message: " + remoteMessage.getNotification().getBody());
    }
}
