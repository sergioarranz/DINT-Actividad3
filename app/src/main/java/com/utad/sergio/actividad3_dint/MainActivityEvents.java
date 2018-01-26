package com.utad.sergio.actividad3_dint;

import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by sergio on 25/1/18.
 */

public class MainActivityEvents implements View.OnClickListener, MainActivityFragmentListener, Fragment2Listener, Fragment3Listener, Fragment4Listener {

    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.fab){
            Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }


    @Override
    public void OnPrevBtnClicked() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.fragment3);
        transition.hide(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment2);
        transition.commit();
    }

    @Override
    public void OnNextBtnClicked() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.fragment2);
        transition.hide(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment3);
        transition.commit();
    }
}
