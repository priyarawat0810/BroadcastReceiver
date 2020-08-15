package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        String msg=null;
        switch(action){
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:msg="Flight mode changed :"+intent.getDataString();break;
            case "priya": msg=intent.getStringExtra("data");break;
        }
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }
}
