package com.brinfotech.feedbacksystem.helpers;

import android.widget.EditText;

public class StringUtils {

    public static String getEditTextValue(EditText edt) {
        return edt.getText().toString().trim();
    }
}
