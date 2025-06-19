package nl.xservices.plugins;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ShareChooserPendingIntent extends BroadcastReceiver {
    public static String chosenComponent = null;
    @Override
    public void onReceive(Context context, Intent intent) {
        // Safely extract the chosen component to avoid NullPointerException
        android.os.Bundle extras = intent.getExtras();
        ShareChooserPendingIntent.chosenComponent = null;
        if (extras != null) {
            Object comp = extras.get(Intent.EXTRA_CHOSEN_COMPONENT);
            if (comp != null) {
                ShareChooserPendingIntent.chosenComponent = comp.toString();
            }
        }
    }
}
