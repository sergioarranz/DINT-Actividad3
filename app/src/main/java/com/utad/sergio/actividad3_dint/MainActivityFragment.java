package com.utad.sergio.actividad3_dint;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivityFragment extends Fragment {

    // TODO Declarar botones
    MainActivityFragmentListener listener;
    MainActivityFragmentEvents events;

    public void setListener(MainActivityFragmentListener listener) {
        this.listener = listener;
    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        this.setListener(listener);
        events=new MainActivityFragmentEvents(this);

        //TODO Linkar botones y sus events
        return v;
    }
}

class MainActivityFragmentEvents implements View.OnClickListener {

    MainActivityFragment mainActivityFragment;

    public MainActivityFragmentEvents(MainActivityFragment mainActivityFragment) {
        this.mainActivityFragment = mainActivityFragment;
    }

    @Override
    public void onClick(View view) {
        // TODO Llamar a los métodos de la interfaz que gestionan los clics
    }
}
