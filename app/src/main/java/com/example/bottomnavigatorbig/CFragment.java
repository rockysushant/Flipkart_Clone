package com.example.bottomnavigatorbig;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class CFragment extends Fragment  {

    RecyclerView recyclerView;


    ArrayList<MainModel3> mainModels3;

    MainAdapter3 mainAdapter3;

    public CFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.notification_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        Button buttonAll = view.findViewById(R.id.buttonAll);
//        buttonAll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((MainActivity)getActivity()).loadFrag(new notificationall(), false);
//            }
//        });
//
//        Button buttonOffer = view.findViewById(R.id.buttonOffer);
//        buttonOffer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((MainActivity)getActivity()).loadFrag(new notificationOffer(), false);
//            }
//        });
//
//    }


//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        recyclerView =view.findViewById(R.id.recycler_view3);
//
//
//        //create Integer array
//        Integer[] langLogo =
//                {R.drawable.supercoin,
//                        R.drawable.coupon,
//                        R.drawable.feed,
//                        R.drawable.credit,
//                        R.drawable.whatsnew,
//                        R.drawable.firedrop,
//                        R.drawable.camera,
//                        R.drawable.games,
//                        R.drawable.liveshop
//                        ,R.drawable.plusxone,
//                        R.drawable.supercoin,
//                        R.drawable.coupon,
//                        R.drawable.feed
//                        ,R.drawable.credit};
//
//        //create String array
//
////        String[] langName = {"android", "angular","c","html", "java","javascript","json","jsshs","vobotstarp","hello","kdjyr","bcudicu"};
//
//
//        //initialize arrayList
//
//        mainModels3 =  new ArrayList<>();
//        for(int i = 0; i<langLogo.length; i++){
//            MainModel3 model = new MainModel3(langLogo[i],null);
//            mainModels3.add(model);
//
//        }
//
//        //Design Horizontal Layout
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(
//                requireActivity(),LinearLayoutManager.HORIZONTAL,false
//        );
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//
//
//        //initialize mainAdapter
//        mainAdapter3= new MainAdapter3(requireActivity(),mainModels3,this);
//
//        //set mainAdapter to recyclerview
//        recyclerView.setAdapter(mainAdapter3);
//
//
//    }
//
//    @Override
//    public void onClick(int position) {
//
//    }
    }
}