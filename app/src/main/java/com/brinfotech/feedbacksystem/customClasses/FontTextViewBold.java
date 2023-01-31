package com.brinfotech.feedbacksystem.customClasses;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

public class FontTextViewBold extends androidx.appcompat.widget.AppCompatTextView {

    public FontTextViewBold(Context context) {
        super(context);
        init();
    }

    public FontTextViewBold(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontTextViewBold(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface face = Typeface.createFromAsset(getContext().getAssets(), "fonts/arial_bold.ttf");
        this.setTypeface(face);
    }


}
