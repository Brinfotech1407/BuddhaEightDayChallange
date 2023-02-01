package com.brinfotech.feedbacksystem.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseFragment;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.pixplicity.easyprefs.library.Prefs;

import butterknife.BindView;

public class MeditationFragment extends BaseFragment {

    @BindView(R.id.loutDayOneMeditation)
    LinearLayout loutDayOneMeditation;

    @BindView(R.id.loutDayTwoMeditation)
    LinearLayout loutDayTwoMeditation;

    @BindView(R.id.loutDayThreeMeditation)
    LinearLayout loutDayThreeMeditation;

    @BindView(R.id.loutDayFourMeditation)
    LinearLayout loutDayFourMeditation;

    @BindView(R.id.loutDayFiveMeditation)
    LinearLayout loutDayFiveMeditation;

    @BindView(R.id.loutDaySixMeditation)
    LinearLayout loutDaySixMeditation;

    @BindView(R.id.loutDaySevenMeditation)
    LinearLayout loutDaySevenMeditation;

    @BindView(R.id.loutDayEightMeditation)
    LinearLayout loutDayEightMeditation;

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);

        initHeaderBar("Meditation");

        toggleVisibilityAccordingToDay();
    }

    private void toggleVisibilityAccordingToDay() {
        String selectedDay = Prefs.getString(PreferenceKeys.SELECTED_DAY, "1");

        switch (selectedDay) {
            case "1":
                showDaySelected(loutDayOneMeditation);
                break;
            case "2":
                showDaySelected(loutDayTwoMeditation);
                break;

            case "3":
                showDaySelected(loutDayThreeMeditation);
                break;
            case "4":
                showDaySelected(loutDayFourMeditation);
                break;

            case "5":
                showDaySelected(loutDayFiveMeditation);
                break;

            case "6":
                showDaySelected(loutDaySixMeditation);
                break;
            case "7":
                showDaySelected(loutDaySevenMeditation);
                break;
            case "8":
                showDaySelected(loutDayEightMeditation);
                break;


        }
    }

    private void showDaySelected(LinearLayout daySelected) {
        loutDayOneMeditation.setVisibility(View.GONE);
        loutDayTwoMeditation.setVisibility(View.GONE);
        loutDayThreeMeditation.setVisibility(View.GONE);
        loutDayFourMeditation.setVisibility(View.GONE);
        loutDayFiveMeditation.setVisibility(View.GONE);
        loutDaySixMeditation.setVisibility(View.GONE);
        loutDaySevenMeditation.setVisibility(View.GONE);
        loutDayEightMeditation.setVisibility(View.GONE);

        daySelected.setVisibility(View.VISIBLE);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.frag_meditation;
    }
}
