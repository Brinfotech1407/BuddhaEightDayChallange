package com.brinfotech.feedbacksystem.network;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.brinfotech.feedbacksystem.R;

public class Utils {

    public static boolean isNetworkConnected(Activity activity){
        ConnectivityManager cm = (ConnectivityManager) activity
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm.getActiveNetworkInfo() != null
                && cm.getActiveNetworkInfo().isAvailable()
                && cm.getActiveNetworkInfo().isConnected()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = activity.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(activity.getResources().getColor(R.color.colorAccent));
            }
            return true;
        } else {
            Toast.makeText(activity, "Please check your internet connection", Toast.LENGTH_LONG).show();

            return false;
        }
    }

}
