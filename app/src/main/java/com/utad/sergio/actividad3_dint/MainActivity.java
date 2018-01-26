package com.utad.sergio.actividad3_dint;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MainActivityEvents events;
    MainActivityFragment mainActivityFragment;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityFragment = (MainActivityFragment) getSupportFragmentManager().findFragmentById(R.id.MainActivityFragment);
        fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.Fragment2);
        fragment3 = (Fragment3) getSupportFragmentManager().findFragmentById(R.id.Fragment3);

        events = new MainActivityEvents(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(events);

        mainActivityFragment.setListener(events);
        fragment2.setListener(events);
        fragment3.setListener(events);

        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.show(mainActivityFragment);
        transition.hide(fragment2);
        transition.hide(fragment3);
        transition.commit();
    }



}