package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionbar = getSupportActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionbar.newTab().setText("Frag 1");
        tab1.setTabListener(new MyTabListener(new Fragmento1()));
        actionbar.addTab(tab1);

        ActionBar.Tab tab2 = actionbar.newTab().setText("Frag 2");
        tab2.setTabListener(new MyTabListener(new Fragmento2()));
        actionbar.addTab(tab2);

        ActionBar.Tab tab3 = actionbar.newTab().setText("Frag 3");
        tab3.setTabListener(new MyTabListener(new Fragmento3()));
        actionbar.addTab(tab3);

    }
}