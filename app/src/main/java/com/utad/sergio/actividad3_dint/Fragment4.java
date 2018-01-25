package com.utad.sergio.actividad3_dint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment4 extends Fragment {

    //TODO Declarar botones
    Fragment4Listener listener;
    Fragment4Events events;

    public void setListener(Fragment4Listener listener) {
        this.listener=listener;
    }

    public Fragment4() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment4, container, false);
        this.setListener(listener);
        events = new Fragment4Events(this);
        // TODO Linkar Botones
        return v;
    }
}

class Fragment4Events implements View.OnClickListener {

    Fragment4 fragment4;

    public Fragment4Events(Fragment4 fragment4){
        this.fragment4 = fragment4;
    }

    @Override
    public void onClick(View view) {
        // TODO Llamar métodos botones
    }
}
