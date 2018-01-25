package com.utad.sergio.actividad3_dint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment3 extends Fragment {

    //TODO Declarar botones
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
        // TODO Linkar Botones
        return v;
    }
}

class Fragment3Events implements View.OnClickListener {

    Fragment3 fragment3;

    public Fragment3Events(Fragment3 fragment3){
        this.fragment3 = fragment3;
    }

    @Override
    public void onClick(View view) {
        // TODO Llamar métodos botones
    }
}
