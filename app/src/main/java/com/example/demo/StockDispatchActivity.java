package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StockDispatchActivity extends AppCompatActivity {

    com.google.android.material.tabs.TabLayout tabLayout;
    android.widget.FrameLayout frameLayout;
    androidx.fragment.app.Fragment fragment = null;
    androidx.fragment.app.FragmentManager fragmentManager;
    androidx.fragment.app.FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.demo.R.layout.activity_stock_dispatch);

        tabLayout=(com.google.android.material.tabs.TabLayout) findViewById(com.example.demo.R.id.tabLayout);
        frameLayout=(android.widget.FrameLayout) findViewById(com.example.demo.R.id.frameLayout);

        fragment = new com.example.demo.ScanQRFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new com.google.android.material.tabs.TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
                // Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new ScanQRFragment();

                        break;
                    case 1:
                           fragment = new RecordsFragment();
                       break;

                }
                androidx.fragment.app.FragmentManager fm = getSupportFragmentManager();
                androidx.fragment.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frameLayout, fragment);
                ft.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {

            }
        });

    }
}