package com.brinfotech.feedbacksystem.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pixplicity.easyprefs.library.Prefs;
import com.brinfotech.feedbacksystem.R;
import com.brinfotech.feedbacksystem.activities.DashboardActivity;
import com.brinfotech.feedbacksystem.customClasses.ProgressLoader;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {


    Unbinder unbinder = null;
    private ProgressLoader loader;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(getFragmentLayout(), container, false);

        unbinder = ButterKnife.bind(this, view);
        onViewCreated(savedInstanceState);
        return view;
    }

    protected abstract int getFragmentLayout();

    protected void onViewCreated(Bundle savedInstanceState) {
    }


    private void doLogout() {
        new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.ic_happiness)
                .setTitle(R.string.app_name)
                .setMessage("Are you sure you want to logout ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Prefs.clear();
                        Intent mainIntent = new Intent(getActivity(), DashboardActivity.class);
                        getActivity().startActivity(mainIntent);
                        getActivity().finish();

                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    public void showToastMessage(String errorMessage) {
        Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_SHORT).show();
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


    public void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }


    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

    public void initHeaderBar(String title) {


        TextView txtSideHead = getActivity().findViewById(R.id.txtTitle);
        ImageView imgInfo = getActivity().findViewById(R.id.imgInfo);
        ImageView imgSettings = getActivity().findViewById(R.id.imgSettings);
        txtSideHead.setText(title);


    }
}
