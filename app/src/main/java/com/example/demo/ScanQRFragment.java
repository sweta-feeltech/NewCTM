package com.example.demo;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ScanQRFragment extends androidx.fragment.app.Fragment {

    public ScanQRFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(com.example.demo.R.layout.fragment_scanqr, container, false);
    }
}