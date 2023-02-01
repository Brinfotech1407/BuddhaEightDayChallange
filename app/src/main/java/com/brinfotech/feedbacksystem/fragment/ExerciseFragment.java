package com.brinfotech.feedbacksystem.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseFragment;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.pixplicity.easyprefs.library.Prefs;

import butterknife.BindView;

public class ExerciseFragment extends BaseFragment {

    @BindView(R.id.loutDayOneExercise)
    LinearLayout loutDayOneExercise;

    @BindView(R.id.loutDayTwoExercise)
    LinearLayout loutDayTwoExercise;

    @BindView(R.id.loutDayThreeExercise)
    LinearLayout loutDayThreeExercise;

    @BindView(R.id.loutDayFourExercise)
    LinearLayout loutDayFourExercise;

    @BindView(R.id.loutDayFiveExercise)
    LinearLayout loutDayFiveExercise;

    @BindView(R.id.loutDaySixExercise)
    LinearLayout loutDaySixExercise;

    @BindView(R.id.loutDaySevenExercise)
    LinearLayout loutDaySevenExercise;

    @BindView(R.id.loutDayEightExercise)
    LinearLayout loutDayEightExercise;

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);

        initHeaderBar("Exercise");

        toggleVisibilityAccordingToDay();
    }

    private void toggleVisibilityAccordingToDay() {
        String selectedDay = Prefs.getString(PreferenceKeys.SELECTED_DAY, "1");

        switch (selectedDay) {
            case "1":
                showDaySelected(loutDayOneExercise);
                break;
            case "2":
                showDaySelected(loutDayTwoExercise);
                break;

            case "3":
                showDaySelected(loutDayThreeExercise);
                break;
            case "4":
                showDaySelected(loutDayFourExercise);
                break;

            case "5":
                showDaySelected(loutDayFiveExercise);
                break;

            case "6":
                showDaySelected(loutDaySixExercise);
                break;
            case "7":
                showDaySelected(loutDaySevenExercise);
                break;
            case "8":
                showDaySelected(loutDayEightExercise);
                break;


        }
    }

    private void showDaySelected(LinearLayout daySelected) {
        loutDayOneExercise.setVisibility(View.GONE);
        loutDayTwoExercise.setVisibility(View.GONE);
        loutDayThreeExercise.setVisibility(View.GONE);
        loutDayFourExercise.setVisibility(View.GONE);
        loutDayFiveExercise.setVisibility(View.GONE);
        loutDaySixExercise.setVisibility(View.GONE);
        loutDaySevenExercise.setVisibility(View.GONE);
        loutDayEightExercise.setVisibility(View.GONE);

        daySelected.setVisibility(View.VISIBLE);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.frag_exercise;
    }
}
