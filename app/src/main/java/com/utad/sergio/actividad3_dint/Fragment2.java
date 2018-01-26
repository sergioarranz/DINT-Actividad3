package com.utad.sergio.actividad3_dint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment2 extends Fragment {

    private Button btnPrev, btnNext;
    private TextView tvFragment2Title;
    Fragment2Listener listener;
    Fragment2Events events;

    public void setListener(Fragment2Listener listener) {
        this.listener=listener;
    }

    public Fragment2() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);
        this.setListener(listener);
        events = new Fragment2Events(this);

        tvFragment2Title = v.findViewById(R.id.tv_Fragment2Title);
        tvFragment2Title.setText(R.string.tv_Fragment2Title);

        btnPrev=v.findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(events);
        btnPrev.setText(R.string.btnPrev_title);

        btnNext=v.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(events);
        btnNext.setText(R.string.btnNext_title);

        return v;
    }
}

class Fragment2Events implements View.OnClickListener {

    Fragment2 fragment2;

    public Fragment2Events(Fragment2 fragment2){
        this.fragment2 = fragment2;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnPrev){
            if (this.fragment2.listener!=null);
            this.fragment2.listener.OnPrevBtn2Clicked();
        }else if (v.getId()==R.id.btnNext){
            if (this.fragment2.listener!=null);
            this.fragment2.listener.OnNextBtn2Clicked();
        }
    }
}
