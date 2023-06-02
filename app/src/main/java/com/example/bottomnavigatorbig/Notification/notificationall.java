package com.example.bottomnavigatorbig.Notification;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigatorbig.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link notificationall#newInstance} factory method to
 * create an instance of this fragment.
 */
public class notificationall extends Fragment {


    public notificationall() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notificationall, container, false);

    }
}