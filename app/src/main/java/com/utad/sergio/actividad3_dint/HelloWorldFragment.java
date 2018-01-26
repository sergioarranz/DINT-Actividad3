package com.utad.sergio.actividad3_dint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloWorldFragment extends Fragment {

    TextView tvHelloWorld;
    public HelloWorldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hello_world, container, false);
        tvHelloWorld = v.findViewById(R.id.tvHelloWorld);
        tvHelloWorld.setText(R.string.tvHelloWorld);
        return v;
    }

}
