package com.brinfotech.feedbacksystem.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.brinfotech.feedbacksystem.base.BaseActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.fragment.ExerciseFragment;
import com.brinfotech.feedbacksystem.fragment.JournalFragment;
import com.brinfotech.feedbacksystem.fragment.MeditationFragment;
import com.brinfotech.feedbacksystem.fragment.StoryFragment;
import com.brinfotech.feedbacksystem.fragment.TeachingFragment;
import com.brinfotech.feedbacksystem.helpers.FragmentHelper;

import java.util.ArrayList;

import butterknife.BindView;

public class DashboardActivity extends BaseActivity {

    @BindView(R.id.bottom_navigation)
    AHBottomNavigation bottomNavigationView;

    @BindView(R.id.imgSettings)
    ImageView imgSettings;

    @BindView(R.id.imgInfo)
    ImageView imgInfo;


    private ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        displayHomeFragment();

        setupBottomMenuNavigationView();

        imgSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SettingActivity.class));
            }
        });

        imgInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InfoScreen.class));
            }
        });
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_dashboard;
    }

    private void setupBottomMenuNavigationView() {
        bottomNavigationItems.clear();

        AHBottomNavigationItem story = new AHBottomNavigationItem(R.string.story, R.drawable.ic_books, R.color.colorWhite);
        AHBottomNavigationItem teaching = new AHBottomNavigationItem(R.string.teaching, R.drawable.ic_teaching, R.color.colorWhite);
        AHBottomNavigationItem meditation = new AHBottomNavigationItem(R.string.meditation, R.drawable.ic_meditation, R.color.colorWhite);
        AHBottomNavigationItem exercise = new AHBottomNavigationItem(R.string.excercise, R.drawable.ic_exercise, R.color.colorWhite);
        AHBottomNavigationItem journal = new AHBottomNavigationItem(R.string.journal, R.drawable.ic_journal, R.color.colorWhite);

        bottomNavigationItems.add(story);
        bottomNavigationItems.add(teaching);
        bottomNavigationItems.add(meditation);
        bottomNavigationItems.add(exercise);
        bottomNavigationItems.add(journal);
//        bottomNavigationItems.add(connection);

        bottomNavigationView.addItems(bottomNavigationItems);
        bottomNavigationView.setColored(true);

        bottomNavigationView.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottomNavigationView.setAccentColor(Color.parseColor("#253497"));
        bottomNavigationView.setInactiveColor(Color.parseColor("#676767"));
        bottomNavigationView.setOnTabSelectedListener(new BottomNavigationTabSelectedListener());
    }

    private void displayHomeFragment() {
        FragmentHelper.changeFragment(DashboardActivity.this,R.id.contentframe,new StoryFragment());
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private class BottomNavigationTabSelectedListener implements AHBottomNavigation.OnTabSelectedListener {
        @Override
        public boolean onTabSelected(int position, boolean wasSelected) {
            switch (position) {
                case 0:
                    redirectToStoryFragment();
                    break;
                case 1:
                    redirectToTeachingFragment();
                    break;
                case 2:
                    redirectToMeditationFragment();
                    break;
                case 3:
                    redirectToExerciseFragment();
                    break;
                case 4:
                    redirectToJournalFragment();
                    break;
                default:

            }

            return true;
        }
    }

    private void redirectToStoryFragment() {
        FragmentHelper.changeFragment(DashboardActivity.this, R.id.contentframe, new StoryFragment());
    }

    private void redirectToTeachingFragment() {
        FragmentHelper.changeFragment(DashboardActivity.this, R.id.contentframe, new TeachingFragment());
    }
    private void redirectToMeditationFragment() {
        FragmentHelper.changeFragment(DashboardActivity.this, R.id.contentframe, new MeditationFragment());
    }
    private void redirectToExerciseFragment() {
        FragmentHelper.changeFragment(DashboardActivity.this, R.id.contentframe, new ExerciseFragment());
    }

    private void redirectToJournalFragment() {
        FragmentHelper.changeFragment(DashboardActivity.this, R.id.contentframe, new JournalFragment());
    }

}
