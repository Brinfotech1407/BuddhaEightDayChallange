package com.brinfotech.feedbacksystem.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseActivity;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.brinfotech.feedbacksystem.network.Utils;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
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

    private InterstitialAd mInterstitialAd;

    private String TAG = "ChangeDayScreen";


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
                loadInterstitialAd("1",true);
//                toggleVisibilityChk("1", true);
            }
        });

        loutDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("2", true);
            }
        });

        loutDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("3", true);
            }
        });

        loutDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("4", true);
            }
        });

        loutDayFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("5", true);
            }
        });

        loutDaySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("6", true);
            }
        });
        loutDaySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("7", true);
            }
        });
        loutDayEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd("8", true);
            }
        });

        setDefaultSelectedDate();


    }

    private void loadInterstitialAd(String selectedDay, boolean redirectToScreen) {

        final ProgressDialog dialog;
        if (Utils.isNetworkConnected(this)) {
            final boolean[] isLoaded = {false};

            dialog = new ProgressDialog(this);
            dialog.setMessage("Please wait ...");
            dialog.show();


            final InterstitialAd mInterstitialAd = new InterstitialAd(this);
            // set the ad unit ID
            mInterstitialAd.setAdUnitId(getActivity().getResources().getString(R.string.ad_mob_interstial_id));

            AdRequest adRequest = new AdRequest.Builder()
                    .build();

            // Load ads into Interstitial Ads
            mInterstitialAd.loadAd(adRequest);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //dialog dismiss
                    if (dialog != null && dialog.isShowing()) {
                        dialog.dismiss();

                        if (!isLoaded[0]) {
                            toggleVisibilityChk(selectedDay,redirectToScreen);
                        }
                    }
                }
            }, 8000);

            mInterstitialAd.setAdListener(new AdListener() {

                public void onAdLoaded() {

                    //  dialog dismiss
                    if (dialog != null && dialog.isShowing()) {
                        dialog.dismiss();

                        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        }
                    }
                    isLoaded[0] = true;
                }

                @Override
                public void onAdFailedToLoad(int i) {
                    if (dialog != null && dialog.isShowing()) {
                        dialog.dismiss();
                        toggleVisibilityChk(selectedDay,redirectToScreen);
                    }
                }

                @Override
                public void onAdClosed() {
                    toggleVisibilityChk(selectedDay,redirectToScreen);
                }


            });


        } else {
            toggleVisibilityChk(selectedDay,redirectToScreen);
        }
    }



    private void setDefaultSelectedDate() {
        String selectedDay = Prefs.getString(PreferenceKeys.SELECTED_DAY, "1");
        toggleVisibilityChk(selectedDay, false);
    }

    private void toggleVisibilityChk(String selectedDay, boolean redirectToScreen) {

        switch (selectedDay) {
            case "1":
                setDaySelected(chkDayOne, selectedDay, redirectToScreen);
                break;
            case "2":
                setDaySelected(chkDayTwo, selectedDay, redirectToScreen);
                break;

            case "3":
                setDaySelected(chkDayThree, selectedDay, redirectToScreen);
                break;
            case "4":
                setDaySelected(chkDayFour, selectedDay, redirectToScreen);
                break;

            case "5":
                setDaySelected(chkDayFive, selectedDay, redirectToScreen);
                break;

            case "6":
                setDaySelected(chkDaySix, selectedDay, redirectToScreen);
                break;
            case "7":
                setDaySelected(chkDaySeven, selectedDay, redirectToScreen);
                break;
            case "8":
                setDaySelected(chkDayEight, selectedDay, redirectToScreen);
                break;


        }
    }

    private void setDaySelected(ImageView chkDaySelected, String selectedDay, boolean redirectToScreen) {
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

        if (redirectToScreen) {
            Intent intent = new Intent(this, DashboardActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_change_day;
    }
}
