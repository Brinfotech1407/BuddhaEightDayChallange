package com.brinfotech.feedbacksystem.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseActivity;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.pixplicity.easyprefs.library.Prefs;

import butterknife.BindView;

public class ChangeDayScreen extends BaseActivity {

    @BindView(R.id.imgBack)
    ImageView imgBack;

    @BindView(R.id.txtTitleView)
    TextView txtTitleView;

    @BindView(R.id.loutDayOne)
    LinearLayout loutDayOne;

    @BindView(R.id.chkDayOne)
    ImageView chkDayOne;

    @BindView(R.id.loutDayTwo)
    LinearLayout loutDayTwo;

    @BindView(R.id.chkDayTwo)
    ImageView chkDayTwo;

    @BindView(R.id.loutDayThree)
    LinearLayout loutDayThree;

    @BindView(R.id.chkDayThree)
    ImageView chkDayThree;

    @BindView(R.id.loutDayFour)
    LinearLayout loutDayFour;

    @BindView(R.id.chkDayFour)
    ImageView chkDayFour;

    @BindView(R.id.loutDayFive)
    LinearLayout loutDayFive;

    @BindView(R.id.chkDayFive)
    ImageView chkDayFive;

    @BindView(R.id.loutDaySix)
    LinearLayout loutDaySix;

    @BindView(R.id.chkDaySix)
    ImageView chkDaySix;

    @BindView(R.id.loutDaySeven)
    LinearLayout loutDaySeven;

    @BindView(R.id.chkDaySeven)
    ImageView chkDaySeven;

    @BindView(R.id.loutDayEight)
    LinearLayout loutDayEight;

    @BindView(R.id.chkDayEight)
    ImageView chkDayEight;


    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        txtTitleView.setText("Change Day");
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        loutDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("1");
            }
        });

        loutDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("2");
            }
        });

        loutDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("3");
            }
        });

        loutDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("4");
            }
        });

        loutDayFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("5");
            }
        });

        loutDaySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("6");
            }
        });
        loutDaySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("7");
            }
        });
        loutDayEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibilityChk("8");
            }
        });
    }

    private void toggleVisibilityChk(String selectedDay) {

        switch (selectedDay) {
            case "1":
                setDayOneSelected(chkDayOne, selectedDay);
                break;
            case "2":
                setDayOneSelected(chkDayTwo, selectedDay);
                break;

            case "3":
                setDayOneSelected(chkDayThree, selectedDay);
                break;
            case "4":
                setDayOneSelected(chkDayFour, selectedDay);
                break;

            case "5":
                setDayOneSelected(chkDayFive, selectedDay);
                break;

            case "6":
                setDayOneSelected(chkDaySix, selectedDay);
                break;
            case "7":
                setDayOneSelected(chkDaySeven, selectedDay);
                break;
            case "8":
                setDayOneSelected(chkDayEight, selectedDay);
                break;


        }
    }

    private void setDayOneSelected(ImageView chkDaySelected, String selectedDay) {
        chkDayOne.setVisibility(View.GONE);
        chkDayTwo.setVisibility(View.GONE);
        chkDayThree.setVisibility(View.GONE);
        chkDayFour.setVisibility(View.GONE);
        chkDayFive.setVisibility(View.GONE);
        chkDaySix.setVisibility(View.GONE);
        chkDaySeven.setVisibility(View.GONE);
        chkDayEight.setVisibility(View.GONE);

        chkDaySelected.setVisibility(View.VISIBLE);

        Prefs.putString(PreferenceKeys.SELECTED_DAY, selectedDay);

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_change_day;
    }
}
