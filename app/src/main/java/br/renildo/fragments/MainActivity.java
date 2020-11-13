package br.renildo.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragmentLeft fl = new FragmentLeft();
        FragmentRight fr = new FragmentRight();

        ft.add(R.id.layout_left, fl, "fl").addToBackStack(null).commit();

        FragmentTransaction ftr = fm.beginTransaction();
        ftr.add(R.id.layout_right, fr, "fr").addToBackStack(null).commit();
    }
}