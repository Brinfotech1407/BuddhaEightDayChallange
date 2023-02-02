package com.brinfotech.feedbacksystem.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.base.BaseFragment;
import com.brinfotech.feedbacksystem.helpers.PreferenceKeys;
import com.brinfotech.feedbacksystem.helpers.StringUtils;
import com.pixplicity.easyprefs.library.Prefs;

import butterknife.BindView;

public class JournalFragment extends BaseFragment {

    @BindView(R.id.loutDayOne)
    LinearLayout loutDayOne;

    @BindView(R.id.arrowDayOne)
    ImageView arrowDayOne;

    @BindView(R.id.lockDayOne)
    ImageView lockDayOne;

    @BindView(R.id.loutDayOneJournal)
    LinearLayout loutDayOneJournal;

    @BindView(R.id.loutDayTwo)
    LinearLayout loutDayTwo;

    @BindView(R.id.arrowDayTwo)
    ImageView arrowDayTwo;

    @BindView(R.id.lockDayTwo)
    ImageView lockDayTwo;

    @BindView(R.id.loutDayTwoJournal)
    LinearLayout loutDayTwoJournal;

    @BindView(R.id.loutDayThree)
    LinearLayout loutDayThree;

    @BindView(R.id.arrowDayThree)
    ImageView arrowDayThree;

    @BindView(R.id.lockDayThree)
    ImageView lockDayThree;

    @BindView(R.id.loutDayThreeJournal)
    LinearLayout loutDayThreeJournal;

    @BindView(R.id.loutDayFour)
    LinearLayout loutDayFour;

    @BindView(R.id.arrowDayFour)
    ImageView arrowDayFour;

    @BindView(R.id.lockDayFour)
    ImageView lockDayFour;

    @BindView(R.id.loutDayFourJournal)
    LinearLayout loutDayFourJournal;


    @BindView(R.id.loutDayFive)
    LinearLayout loutDayFive;

    @BindView(R.id.arrowDayFive)
    ImageView arrowDayFive;

    @BindView(R.id.lockDayFive)
    ImageView lockDayFive;

    @BindView(R.id.loutDayFiveJournal)
    LinearLayout loutDayFiveJournal;

    @BindView(R.id.loutDaySix)
    LinearLayout loutDaySix;

    @BindView(R.id.arrowDaySix)
    ImageView arrowDaySix;

    @BindView(R.id.lockDaySix)
    ImageView lockDaySix;

    @BindView(R.id.loutDaySixJournal)
    LinearLayout loutDaySixJournal;

    @BindView(R.id.loutDaySeven)
    LinearLayout loutDaySeven;

    @BindView(R.id.arrowDaySeven)
    ImageView arrowDaySeven;

    @BindView(R.id.lockDaySeven)
    ImageView lockDaySeven;

    @BindView(R.id.loutDaySevenJournal)
    LinearLayout loutDaySevenJournal;

    @BindView(R.id.loutDayEight)
    LinearLayout loutDayEight;

    @BindView(R.id.arrowDayEight)
    ImageView arrowDayEight;

    @BindView(R.id.lockDayEight)
    ImageView lockDayEight;

    @BindView(R.id.loutDayEightJournal)
    LinearLayout loutDayEightJournal;


    @BindView(R.id.btnSave)
    Button btnSave;


    //Questions Field Day1

    @BindView(R.id.edtDayOneQuestionOne)
    EditText edtDayOneQuestionOne;

    @BindView(R.id.edtDayOneQuestionTwo)
    EditText edtDayOneQuestionTwo;

    @BindView(R.id.edtDayOneQuestionThree)
    EditText edtDayOneQuestionThree;

    @BindView(R.id.edtDayOneQuestionFour)
    EditText edtDayOneQuestionFour;

    @BindView(R.id.edtDayOneQuestionFive)
    EditText edtDayOneQuestionFive;


    //Questions Field Day2

    @BindView(R.id.edtDayTwoQuestionOne)
    EditText edtDayTwoQuestionOne;

    @BindView(R.id.edtDayTwoQuestionTwo)
    EditText edtDayTwoQuestionTwo;

    @BindView(R.id.edtDayTwoQuestionThree)
    EditText edtDayTwoQuestionThree;

    @BindView(R.id.edtDayTwoQuestionFour)
    EditText edtDayTwoQuestionFour;

    @BindView(R.id.edtDayTwoQuestionFive)
    EditText edtDayTwoQuestionFive;
    @BindView(R.id.edtDayTwoQuestionSix)
    EditText edtDayTwoQuestionSix;

    @BindView(R.id.edtDayTwoQuestionSeven)
    EditText edtDayTwoQuestionSeven;

    //Questions Field Day3

    @BindView(R.id.edtDayThreeQuestionOne)
    EditText edtDayThreeQuestionOne;

    @BindView(R.id.edtDayThreeQuestionTwo)
    EditText edtDayThreeQuestionTwo;

    @BindView(R.id.edtDayThreeQuestionThree)
    EditText edtDayThreeQuestionThree;

    @BindView(R.id.edtDayThreeQuestionFour)
    EditText edtDayThreeQuestionFour;

    @BindView(R.id.edtDayThreeQuestionFive)
    EditText edtDayThreeQuestionFive;
    @BindView(R.id.edtDayThreeQuestionSix)
    EditText edtDayThreeQuestionSix;

    @BindView(R.id.edtDayThreeQuestionSeven)
    EditText edtDayThreeQuestionSeven;

    @BindView(R.id.edtDayThreeQuestionEight)
    EditText edtDayThreeQuestionEight;

    @BindView(R.id.edtDayThreeQuestionNine)
    EditText edtDayThreeQuestionNine;

    //Questions Field Day4
    @BindView(R.id.edtDayFourQuestionOne)
    EditText edtDayFourQuestionOne;

    @BindView(R.id.edtDayFourQuestionTwo)
    EditText edtDayFourQuestionTwo;

    @BindView(R.id.edtDayFourQuestionThree)
    EditText edtDayFourQuestionThree;

    @BindView(R.id.edtDayFourQuestionFour)
    EditText edtDayFourQuestionFour;

    @BindView(R.id.edtDayFourQuestionFive)
    EditText edtDayFourQuestionFive;
    @BindView(R.id.edtDayFourQuestionSix)
    EditText edtDayFourQuestionSix;
    
    //Questions Field Day5
    @BindView(R.id.edtDayFiveQuestionOne)
    EditText edtDayFiveQuestionOne;

    @BindView(R.id.edtDayFiveQuestionTwo)
    EditText edtDayFiveQuestionTwo;

    @BindView(R.id.edtDayFiveQuestionThree)
    EditText edtDayFiveQuestionThree;

    @BindView(R.id.edtDayFiveQuestionFour)
    EditText edtDayFiveQuestionFour;

    @BindView(R.id.edtDayFiveQuestionFive)
    EditText edtDayFiveQuestionFive; 
    
    //Questions Field Day6
    @BindView(R.id.edtDaySixQuestionOne)
    EditText edtDaySixQuestionOne;

    @BindView(R.id.edtDaySixQuestionTwo)
    EditText edtDaySixQuestionTwo;

    @BindView(R.id.edtDaySixQuestionThree)
    EditText edtDaySixQuestionThree;

    @BindView(R.id.edtDaySixQuestionFour)
    EditText edtDaySixQuestionFour;

    @BindView(R.id.edtDaySixQuestionFive)
    EditText edtDaySixQuestionFive;
    
    //Questions Field Day7
    @BindView(R.id.edtDaySevenQuestionOne)
    EditText edtDaySevenQuestionOne;

    @BindView(R.id.edtDaySevenQuestionTwo)
    EditText edtDaySevenQuestionTwo;

    @BindView(R.id.edtDaySevenQuestionThree)
    EditText edtDaySevenQuestionThree;

    @BindView(R.id.edtDaySevenQuestionFour)
    EditText edtDaySevenQuestionFour;


    //Questions Field Day8
    @BindView(R.id.edtDayEightQuestionOne)
    EditText edtDayEightQuestionOne;

    @BindView(R.id.edtDayEightQuestionTwo)
    EditText edtDayEightQuestionTwo;
    


    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        super.onViewCreated(savedInstanceState);

        initHeaderBar("Journal");

        initDataAccordingToDay();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveDataToPreference();
            }
        });

        setDataFromLocal();
    }

    private void setDataFromLocal() {
        edtDayOneQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_ONE_Q_ONE,""));
        edtDayOneQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_ONE_Q_TWO,""));
        edtDayOneQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_ONE_Q_THREE,""));
        edtDayOneQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_ONE_Q_FOUR,""));
        edtDayOneQuestionFive.setText(Prefs.getString(PreferenceKeys.DAY_ONE_Q_FIVE,""));


        edtDayTwoQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_ONE,""));
        edtDayTwoQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_TWO,""));
        edtDayTwoQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_THREE,""));
        edtDayTwoQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_FOUR,""));
        edtDayTwoQuestionFive.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_FIVE,""));
        edtDayTwoQuestionSix.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_SIX,""));
        edtDayTwoQuestionSeven.setText(Prefs.getString(PreferenceKeys.DAY_TWO_Q_SEVEN,""));

        edtDayThreeQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_ONE,""));
        edtDayThreeQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_TWO,""));
        edtDayThreeQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_THREE,""));
        edtDayThreeQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_FOUR,""));
        edtDayThreeQuestionFive.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_FIVE,""));
        edtDayThreeQuestionSix.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_SIX,""));
        edtDayThreeQuestionSeven.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_SEVEN,""));
        edtDayThreeQuestionEight.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_EIGHT,""));
        edtDayThreeQuestionNine.setText(Prefs.getString(PreferenceKeys.DAY_THREE_Q_NINE,""));


        edtDayFourQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_FOUR_Q_ONE,""));
        edtDayFourQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_FOUR_Q_TWO,""));
        edtDayFourQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_FOUR_Q_THREE,""));
        edtDayFourQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_FOUR_Q_FOUR,""));
        edtDayFourQuestionFive.setText(Prefs.getString(PreferenceKeys.DAY_FOUR_Q_FIVE,""));
        edtDayFourQuestionSix.setText(Prefs.getString(PreferenceKeys.DAY_FOUR_Q_SIX,""));


        edtDayFiveQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_FIVE_Q_ONE,""));
        edtDayFiveQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_FIVE_Q_TWO,""));
        edtDayFiveQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_FIVE_Q_THREE,""));
        edtDayFiveQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_FIVE_Q_FOUR,""));
        edtDayFiveQuestionFive.setText(Prefs.getString(PreferenceKeys.DAY_FIVE_Q_FIVE,""));


        edtDaySixQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_SIX_Q_ONE,""));
        edtDaySixQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_SIX_Q_TWO,""));
        edtDaySixQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_SIX_Q_THREE,""));
        edtDaySixQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_SIX_Q_FOUR,""));
        edtDaySixQuestionFive.setText(Prefs.getString(PreferenceKeys.DAY_SIX_Q_FIVE,""));


        edtDaySevenQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_SEVEN_Q_ONE,""));
        edtDaySevenQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_SEVEN_Q_TWO,""));
        edtDaySevenQuestionThree.setText(Prefs.getString(PreferenceKeys.DAY_SEVEN_Q_THREE,""));
        edtDaySevenQuestionFour.setText(Prefs.getString(PreferenceKeys.DAY_SEVEN_Q_FOUR,""));


        edtDayEightQuestionOne.setText(Prefs.getString(PreferenceKeys.DAY_EIGHT_Q_ONE,""));
        edtDayEightQuestionTwo.setText(Prefs.getString(PreferenceKeys.DAY_EIGHT_Q_TWO,""));
    }

    private void saveDataToPreference() {
        Prefs.putString(PreferenceKeys.DAY_ONE_Q_ONE, StringUtils.getEditTextValue(edtDayOneQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_ONE_Q_TWO, StringUtils.getEditTextValue(edtDayOneQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_ONE_Q_THREE, StringUtils.getEditTextValue(edtDayOneQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_ONE_Q_FOUR, StringUtils.getEditTextValue(edtDayOneQuestionFour));
        Prefs.putString(PreferenceKeys.DAY_ONE_Q_FIVE, StringUtils.getEditTextValue(edtDayOneQuestionFive));

        Prefs.putString(PreferenceKeys.DAY_TWO_Q_ONE, StringUtils.getEditTextValue(edtDayTwoQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_TWO_Q_TWO, StringUtils.getEditTextValue(edtDayTwoQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_TWO_Q_THREE, StringUtils.getEditTextValue(edtDayTwoQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_TWO_Q_FOUR, StringUtils.getEditTextValue(edtDayTwoQuestionFour));
        Prefs.putString(PreferenceKeys.DAY_TWO_Q_FIVE, StringUtils.getEditTextValue(edtDayTwoQuestionFive));
        Prefs.putString(PreferenceKeys.DAY_TWO_Q_SIX, StringUtils.getEditTextValue(edtDayTwoQuestionSix));
        Prefs.putString(PreferenceKeys.DAY_TWO_Q_SEVEN, StringUtils.getEditTextValue(edtDayTwoQuestionSeven));

        Prefs.putString(PreferenceKeys.DAY_THREE_Q_ONE, StringUtils.getEditTextValue(edtDayThreeQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_TWO, StringUtils.getEditTextValue(edtDayThreeQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_THREE, StringUtils.getEditTextValue(edtDayThreeQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_FOUR, StringUtils.getEditTextValue(edtDayThreeQuestionFour));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_FIVE, StringUtils.getEditTextValue(edtDayThreeQuestionFive));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_SIX, StringUtils.getEditTextValue(edtDayThreeQuestionSix));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_SEVEN, StringUtils.getEditTextValue(edtDayThreeQuestionSeven));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_EIGHT, StringUtils.getEditTextValue(edtDayThreeQuestionEight));
        Prefs.putString(PreferenceKeys.DAY_THREE_Q_NINE, StringUtils.getEditTextValue(edtDayThreeQuestionNine));


        Prefs.putString(PreferenceKeys.DAY_FOUR_Q_ONE, StringUtils.getEditTextValue(edtDayFourQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_FOUR_Q_TWO, StringUtils.getEditTextValue(edtDayFourQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_FOUR_Q_THREE, StringUtils.getEditTextValue(edtDayFourQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_FOUR_Q_FOUR, StringUtils.getEditTextValue(edtDayFourQuestionFour));
        Prefs.putString(PreferenceKeys.DAY_FOUR_Q_FIVE, StringUtils.getEditTextValue(edtDayFourQuestionFive));
        Prefs.putString(PreferenceKeys.DAY_FOUR_Q_SIX, StringUtils.getEditTextValue(edtDayFourQuestionSix)); 
        
        Prefs.putString(PreferenceKeys.DAY_FIVE_Q_ONE, StringUtils.getEditTextValue(edtDayFiveQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_FIVE_Q_TWO, StringUtils.getEditTextValue(edtDayFiveQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_FIVE_Q_THREE, StringUtils.getEditTextValue(edtDayFiveQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_FIVE_Q_FOUR, StringUtils.getEditTextValue(edtDayFiveQuestionFour));
        Prefs.putString(PreferenceKeys.DAY_FIVE_Q_FIVE, StringUtils.getEditTextValue(edtDayFiveQuestionFive));
        
        Prefs.putString(PreferenceKeys.DAY_SIX_Q_ONE, StringUtils.getEditTextValue(edtDaySixQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_SIX_Q_TWO, StringUtils.getEditTextValue(edtDaySixQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_SIX_Q_THREE, StringUtils.getEditTextValue(edtDaySixQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_SIX_Q_FOUR, StringUtils.getEditTextValue(edtDaySixQuestionFour));
        Prefs.putString(PreferenceKeys.DAY_SIX_Q_FIVE, StringUtils.getEditTextValue(edtDaySixQuestionFive));


        Prefs.putString(PreferenceKeys.DAY_SEVEN_Q_ONE, StringUtils.getEditTextValue(edtDaySevenQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_SEVEN_Q_TWO, StringUtils.getEditTextValue(edtDaySevenQuestionTwo));
        Prefs.putString(PreferenceKeys.DAY_SEVEN_Q_THREE, StringUtils.getEditTextValue(edtDaySevenQuestionThree));
        Prefs.putString(PreferenceKeys.DAY_SEVEN_Q_FOUR, StringUtils.getEditTextValue(edtDaySevenQuestionFour));

        Prefs.putString(PreferenceKeys.DAY_EIGHT_Q_ONE, StringUtils.getEditTextValue(edtDayEightQuestionOne));
        Prefs.putString(PreferenceKeys.DAY_EIGHT_Q_TWO, StringUtils.getEditTextValue(edtDayEightQuestionTwo));

    }

    private void initDataAccordingToDay() {
        String selectedDay = Prefs.getString(PreferenceKeys.SELECTED_DAY, "1");

        switch (selectedDay) {
            case "1":
                showDayOneViews();
                break;
            case "2":
                showDayTwoViews();
                break;
            case "3":
                showDayThreeViews();
                break;
            case "4":
                showDayFourViews();
                break;
            case "5":
                showDayFiveViews();
                break;
            case "6":
                showDaySixViews();
                break;
            case "7":
                showDaySevenViews();
                break;
            case "8":
                showDayEightViews();
                break;

        }
    }

    private void showDayOneViews() {
        arrowDayTwo.setVisibility(View.GONE);
        lockDayTwo.setVisibility(View.VISIBLE);

        arrowDayThree.setVisibility(View.GONE);
        lockDayThree.setVisibility(View.VISIBLE);

        arrowDayFour.setVisibility(View.GONE);
        lockDayFour.setVisibility(View.VISIBLE);

        arrowDayFive.setVisibility(View.GONE);
        lockDayFive.setVisibility(View.VISIBLE);

        arrowDaySix.setVisibility(View.GONE);
        lockDaySix.setVisibility(View.VISIBLE);

        arrowDaySeven.setVisibility(View.GONE);
        lockDaySeven.setVisibility(View.VISIBLE);

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });
    }


    private void showDayTwoViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.GONE);
        lockDayThree.setVisibility(View.VISIBLE);

        arrowDayFour.setVisibility(View.GONE);
        lockDayFour.setVisibility(View.VISIBLE);

        arrowDayFive.setVisibility(View.GONE);
        lockDayFive.setVisibility(View.VISIBLE);

        arrowDaySix.setVisibility(View.GONE);
        lockDaySix.setVisibility(View.VISIBLE);

        arrowDaySeven.setVisibility(View.GONE);
        lockDaySeven.setVisibility(View.VISIBLE);

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);


    }


    private void showDayThreeViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.VISIBLE);
        lockDayThree.setVisibility(View.GONE);

        arrowDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayThreeJournal.setVisibility(loutDayThreeJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFour.setVisibility(View.GONE);
        lockDayFour.setVisibility(View.VISIBLE);

        arrowDayFive.setVisibility(View.GONE);
        lockDayFive.setVisibility(View.VISIBLE);

        arrowDaySix.setVisibility(View.GONE);
        lockDaySix.setVisibility(View.VISIBLE);

        arrowDaySeven.setVisibility(View.GONE);
        lockDaySeven.setVisibility(View.VISIBLE);

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);


    }

    private void showDayFourViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.VISIBLE);
        lockDayThree.setVisibility(View.GONE);

        arrowDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayThreeJournal.setVisibility(loutDayThreeJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFour.setVisibility(View.VISIBLE);
        lockDayFour.setVisibility(View.GONE);

        arrowDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFourJournal.setVisibility(loutDayFourJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFive.setVisibility(View.GONE);
        lockDayFive.setVisibility(View.VISIBLE);

        arrowDaySix.setVisibility(View.GONE);
        lockDaySix.setVisibility(View.VISIBLE);

        arrowDaySeven.setVisibility(View.GONE);
        lockDaySeven.setVisibility(View.VISIBLE);

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);


    }

    private void showDayFiveViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.VISIBLE);
        lockDayThree.setVisibility(View.GONE);

        arrowDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayThreeJournal.setVisibility(loutDayThreeJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFour.setVisibility(View.VISIBLE);
        lockDayFour.setVisibility(View.GONE);

        arrowDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFourJournal.setVisibility(loutDayFourJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFive.setVisibility(View.VISIBLE);
        lockDayFive.setVisibility(View.GONE);

        arrowDayFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFiveJournal.setVisibility(loutDayFiveJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySix.setVisibility(View.GONE);
        lockDaySix.setVisibility(View.VISIBLE);

        arrowDaySeven.setVisibility(View.GONE);
        lockDaySeven.setVisibility(View.VISIBLE);

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);


    }

    private void showDaySixViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.VISIBLE);
        lockDayThree.setVisibility(View.GONE);

        arrowDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayThreeJournal.setVisibility(loutDayThreeJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFour.setVisibility(View.VISIBLE);
        lockDayFour.setVisibility(View.GONE);

        arrowDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFourJournal.setVisibility(loutDayFourJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFive.setVisibility(View.VISIBLE);
        lockDayFive.setVisibility(View.GONE);

        arrowDayFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFiveJournal.setVisibility(loutDayFiveJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySix.setVisibility(View.VISIBLE);
        lockDaySix.setVisibility(View.GONE);

        arrowDaySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDaySixJournal.setVisibility(loutDaySixJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySeven.setVisibility(View.GONE);
        lockDaySeven.setVisibility(View.VISIBLE);

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);


    }

    private void showDaySevenViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.VISIBLE);
        lockDayThree.setVisibility(View.GONE);

        arrowDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayThreeJournal.setVisibility(loutDayThreeJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFour.setVisibility(View.VISIBLE);
        lockDayFour.setVisibility(View.GONE);

        arrowDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFourJournal.setVisibility(loutDayFourJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFive.setVisibility(View.VISIBLE);
        lockDayFive.setVisibility(View.GONE);

        arrowDayFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFiveJournal.setVisibility(loutDayFiveJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySix.setVisibility(View.VISIBLE);
        lockDaySix.setVisibility(View.GONE);

        arrowDaySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDaySixJournal.setVisibility(loutDaySixJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySeven.setVisibility(View.VISIBLE);
        lockDaySeven.setVisibility(View.GONE);

        arrowDaySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDaySevenJournal.setVisibility(loutDaySevenJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayEight.setVisibility(View.GONE);
        lockDayEight.setVisibility(View.VISIBLE);


    }


    private void showDayEightViews() {

        arrowDayOne.setVisibility(View.VISIBLE);
        lockDayOne.setVisibility(View.GONE);

        arrowDayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayOneJournal.setVisibility(loutDayOneJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayTwo.setVisibility(View.VISIBLE);
        lockDayTwo.setVisibility(View.GONE);

        arrowDayTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayTwoJournal.setVisibility(loutDayTwoJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayThree.setVisibility(View.VISIBLE);
        lockDayThree.setVisibility(View.GONE);

        arrowDayThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayThreeJournal.setVisibility(loutDayThreeJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFour.setVisibility(View.VISIBLE);
        lockDayFour.setVisibility(View.GONE);

        arrowDayFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFourJournal.setVisibility(loutDayFourJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayFive.setVisibility(View.VISIBLE);
        lockDayFive.setVisibility(View.GONE);

        arrowDayFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayFiveJournal.setVisibility(loutDayFiveJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySix.setVisibility(View.VISIBLE);
        lockDaySix.setVisibility(View.GONE);

        arrowDaySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDaySixJournal.setVisibility(loutDaySixJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDaySeven.setVisibility(View.VISIBLE);
        lockDaySeven.setVisibility(View.GONE);

        arrowDaySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDaySevenJournal.setVisibility(loutDaySevenJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });

        arrowDayEight.setVisibility(View.VISIBLE);
        lockDayEight.setVisibility(View.GONE);


        arrowDayEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loutDayEightJournal.setVisibility(loutDayEightJournal.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);

            }
        });


    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.frag_journal;
    }
}
