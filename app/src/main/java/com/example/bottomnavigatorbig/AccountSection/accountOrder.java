package com.example.bottomnavigatorbig.AccountSection;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigatorbig.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link accountOrder#newInstance} factory method to
 * create an instance of this fragment.
 */
public class accountOrder extends Fragment {


    public accountOrder() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_order, container, false);
    }
}