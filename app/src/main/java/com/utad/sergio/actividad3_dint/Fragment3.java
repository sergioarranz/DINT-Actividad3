package com.utad.sergio.actividad3_dint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment3 extends Fragment {

    Button btnPrev, btnNext;
    private TextView tvFragment3Title;
    Fragment3Listener listener;
    Fragment3Events events;

    public void setListener(Fragment3Listener listener) {
        this.listener=listener;
    }

    public Fragment3() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment3, container, false);
        this.setListener(listener);
        events = new Fragment3Events(this);

        tvFragment3Title = v.findViewById(R.id.tv_Fragment3Title);
        tvFragment3Title.setText(R.string.tv_Fragment3Title);

        btnPrev=v.findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(events);
        btnPrev.setText(R.string.btnPrev_title);

        btnNext=v.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(events);
        btnNext.setText(R.string.btnNext_title);

        return v;
    }
}

class Fragment3Events implements View.OnClickListener {

    Fragment3 fragment3;

    public Fragment3Events(Fragment3 fragment3){
        this.fragment3 = fragment3;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnPrev){
            if (this.fragment3.listener!=null);
            this.fragment3.listener.OnPrevBtn3Clicked();
        }else if (v.getId()==R.id.btnNext){
            if (this.fragment3.listener!=null);
            this.fragment3.listener.OnNextBtn3Clicked();
        }
    }
}
