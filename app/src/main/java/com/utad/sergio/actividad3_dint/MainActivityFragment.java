package com.utad.sergio.actividad3_dint;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivityFragment extends Fragment {
    private Button btnPrev,btnNext;
    MainActivityFragmentListener listener;
    MainActivityFragmentEvents events;

    public void setListener(MainActivityFragmentListener listener) {
        this.listener = listener;
    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        this.setListener(listener);
        events=new MainActivityFragmentEvents(this);

        btnPrev = v.findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(events);
        btnPrev.setText(R.string.btnPrev_title);

        btnNext = v.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(events);
        btnNext.setText(R.string.btnNext_title);
        return v;
    }
}

class MainActivityFragmentEvents implements View.OnClickListener {

    MainActivityFragment mainActivityFragment;

    public MainActivityFragmentEvents(MainActivityFragment mainActivityFragment) {
        this.mainActivityFragment = mainActivityFragment;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnPrev){
            if(this.mainActivityFragment.listener!=null);
            this.mainActivityFragment.listener.OnPrevBtnClicked();
        } else if (v.getId()==R.id.btnNext){
            if(this.mainActivityFragment.listener!=null);
            this.mainActivityFragment.listener.OnNextBtnClicked();
        }
    }
}
