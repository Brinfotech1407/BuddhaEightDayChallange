package com.brinfotech.feedbacksystem.fragment;

import android.os.Bundle;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseFragment;

public class MeditationFragment extends BaseFragment {

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);

        initHeaderBar("Meditation");
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.frag_meditation;
    }
}
