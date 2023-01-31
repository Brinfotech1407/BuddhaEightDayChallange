package com.brinfotech.feedbacksystem.helpers;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class FragmentHelper {

    public static void changeFragment(Activity activity, int container, Fragment fragmentToLoad) {

        FragmentManager fragment = activity.getFragmentManager();
        FragmentTransaction ft = fragment.beginTransaction();
        ft.replace(container, fragmentToLoad);
        ft.commit();


    }
}

