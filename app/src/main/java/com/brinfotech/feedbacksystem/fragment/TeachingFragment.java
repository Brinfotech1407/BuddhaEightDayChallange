package com.brinfotech.feedbacksystem.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseFragment;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.pixplicity.easyprefs.library.Prefs;

import butterknife.BindView;

public class TeachingFragment extends BaseFragment {


    @BindView(R.id.loutDayOneTeaching)
    LinearLayout loutDayOneTeaching;

    @BindView(R.id.loutDayTwoTeaching)
    LinearLayout loutDayTwoTeaching;

    @BindView(R.id.loutDayThreeTeaching)
    LinearLayout loutDayThreeTeaching;

    @BindView(R.id.loutDayFourTeaching)
    LinearLayout loutDayFourTeaching;

    @BindView(R.id.loutDayFiveTeaching)
    LinearLayout loutDayFiveTeaching;

    @BindView(R.id.loutDaySixTeaching)
    LinearLayout loutDaySixTeaching;

    @BindView(R.id.loutDaySevenTeaching)
    LinearLayout loutDaySevenTeaching;

    @BindView(R.id.loutDayEightTeaching)
    LinearLayout loutDayEightTeaching;

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);

        initHeaderBar("Teaching");

        toggleVisibilityAccordingToDay();
    }

    private void toggleVisibilityAccordingToDay() {
        String selectedDay = Prefs.getString(PreferenceKeys.SELECTED_DAY, "1");

        switch (selectedDay) {
            case "1":
                showDaySelected(loutDayOneTeaching);
                break;
            case "2":
                showDaySelected(loutDayTwoTeaching);
                break;

            case "3":
                showDaySelected(loutDayThreeTeaching);
                break;
            case "4":
                showDaySelected(loutDayFourTeaching);
                break;

            case "5":
                showDaySelected(loutDayFiveTeaching);
                break;

            case "6":
                showDaySelected(loutDaySixTeaching);
                break;
            case "7":
                showDaySelected(loutDaySevenTeaching);
                break;
            case "8":
                showDaySelected(loutDayEightTeaching);
                break;


        }
    }

    private void showDaySelected(LinearLayout daySelected) {
        loutDayOneTeaching.setVisibility(View.GONE);
        loutDayTwoTeaching.setVisibility(View.GONE);
        loutDayThreeTeaching.setVisibility(View.GONE);
        loutDayFourTeaching.setVisibility(View.GONE);
        loutDayFiveTeaching.setVisibility(View.GONE);
        loutDaySixTeaching.setVisibility(View.GONE);
        loutDaySevenTeaching.setVisibility(View.GONE);
        loutDayEightTeaching.setVisibility(View.GONE);

        daySelected.setVisibility(View.VISIBLE);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.frag_teaching;
    }
}
