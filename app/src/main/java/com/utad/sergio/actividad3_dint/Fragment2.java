package com.utad.sergio.actividad3_dint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2 extends Fragment {

    //TODO Declarar botones
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
        // TODO Linkar Botones
        return v;
    }
}

class Fragment2Events implements View.OnClickListener {

    Fragment2 fragment2;

    public Fragment2Events(Fragment2 fragment2){
        this.fragment2 = fragment2;
    }

    @Override
    public void onClick(View view) {
        // TODO Llamar métodos botones
    }
}
