package com.brinfotech.feedbacksystem.customClasses;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.RadioButton;

import androidx.annotation.Nullable;

public class FontRadioButtonBold extends RadioButton {

    public FontRadioButtonBold(Context context) {
        super(context);
        init();
    }

    public FontRadioButtonBold(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontRadioButtonBold(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface face = Typeface.createFromAsset(getContext().getAssets(), "fonts/poppins_semi_bold.ttf");
        this.setTypeface(face);
    }


}
