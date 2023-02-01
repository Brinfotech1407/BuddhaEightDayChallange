package com.brinfotech.feedbacksystem.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseFragment;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.pixplicity.easyprefs.library.Prefs;

import butterknife.BindView;

public class StoryFragment extends BaseFragment {

    @BindView(R.id.loutDayOneStory)
    LinearLayout loutDayOneStory;

    @BindView(R.id.loutDayTwoStory)
    LinearLayout loutDayTwoStory;

    @BindView(R.id.loutDayThreeStory)
    LinearLayout loutDayThreeStory;

    @BindView(R.id.loutDayFourStory)
    LinearLayout loutDayFourStory;

    @BindView(R.id.loutDayFiveStory)
    LinearLayout loutDayFiveStory;

    @BindView(R.id.loutDaySixStory)
    LinearLayout loutDaySixStory;

    @BindView(R.id.loutDaySevenStory)
    LinearLayout loutDaySevenStory;

    @BindView(R.id.loutDayEightStory)
    LinearLayout loutDayEightStory;

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);

        initHeaderBar("Story");

        toggleVisibilityAccordingToDay();
    }

    private void toggleVisibilityAccordingToDay() {
        String selectedDay = Prefs.getString(PreferenceKeys.SELECTED_DAY, "1");

        switch (selectedDay) {
            case "1":
                showDaySelected(loutDayOneStory);
                break;
            case "2":
                showDaySelected(loutDayTwoStory);
                break;

            case "3":
                showDaySelected(loutDayThreeStory);
                break;
            case "4":
                showDaySelected(loutDayFourStory);
                break;

            case "5":
                showDaySelected(loutDayFiveStory);
                break;

            case "6":
                showDaySelected(loutDaySixStory);
                break;
            case "7":
                showDaySelected(loutDaySevenStory);
                break;
            case "8":
                showDaySelected(loutDayEightStory);
                break;


        }
    }

    private void showDaySelected(LinearLayout daySelected) {
        loutDayOneStory.setVisibility(View.GONE);
        loutDayTwoStory.setVisibility(View.GONE);
        loutDayThreeStory.setVisibility(View.GONE);
        loutDayFourStory.setVisibility(View.GONE);
        loutDayFiveStory.setVisibility(View.GONE);
        loutDaySixStory.setVisibility(View.GONE);
        loutDaySevenStory.setVisibility(View.GONE);
        loutDayEightStory.setVisibility(View.GONE);

        daySelected.setVisibility(View.VISIBLE);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.frag_story;
    }
}
