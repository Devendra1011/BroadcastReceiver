package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver() {

    // BroadCast Receiver: allows the registartion and handling
    // of system-wide broadcast messages
    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent?.action != null && intent.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {

            var isAirplaneModeOn: Boolean = intent.getBooleanExtra("state", false)

            if (isAirplaneModeOn) {

                Toast.makeText(context, "Airplane mode is On", Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(context, "Airplane mode is Off", Toast.LENGTH_SHORT).show()

            }
        }
    }
}