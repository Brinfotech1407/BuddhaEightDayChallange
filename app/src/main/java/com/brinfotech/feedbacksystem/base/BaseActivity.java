package com.brinfotech.feedbacksystem.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.activities.SettingActivity;
import com.brinfotech.feedbacksystem.customClasses.ProgressLoader;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {

    Unbinder unbinder = null;
    @Nullable
    @BindView(R.id.imgSettings)
    ImageView imgSettings;
    private ProgressLoader loader;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        unbinder = ButterKnife.bind(this);
    }

    protected abstract int getLayoutResource();

    public void showToastMessage(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }

    public void showProgressBar() {

        //Check if Activity is null then close activity.
        if (getActivity() == null) {
            return;
        } else {
            //If loader instance is null then re-create object.
            if (loader == null) {
                loader = new ProgressLoader(getActivity());
            }

            //If progress bar is not showing then show progress bar.
            if (!loader.isShowing()) {
                loader.show();
            }
        }

    }

    public void hideProgressBar() {

        if (loader != null && loader.isShowing()) {
            loader.dismiss();
        }
    }

    public BaseActivity getActivity() {
        return BaseActivity.this;
    }

    public void hideSoftKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

}
