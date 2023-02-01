package com.brinfotech.feedbacksystem.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseActivity;

import butterknife.BindView;

public class SettingActivity extends BaseActivity {

    @BindView(R.id.imgBack)
    ImageView imgBack;

    @BindView(R.id.txtTitleView)
    TextView txtTitleView;

    @BindView(R.id.loutChangeDay)
    LinearLayout loutChangeDay;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        txtTitleView.setText("Setting");
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        loutChangeDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this, ChangeDayScreen.class));
                finish();
            }
        });

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_setting_view;
    }
}
