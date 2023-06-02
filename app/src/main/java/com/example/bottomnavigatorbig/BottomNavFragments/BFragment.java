package com.example.bottomnavigatorbig.BottomNavFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bottomnavigatorbig.MainActivity;
import com.example.bottomnavigatorbig.R;
import com.example.bottomnavigatorbig.CategoriesSection.categories_Games;
import com.example.bottomnavigatorbig.CategoriesSection.categories_appliances;
import com.example.bottomnavigatorbig.CategoriesSection.categories_bikesandcar;
import com.example.bottomnavigatorbig.CategoriesSection.categories_camera;
import com.example.bottomnavigatorbig.CategoriesSection.categories_coupon;
import com.example.bottomnavigatorbig.CategoriesSection.categories_credit;
import com.example.bottomnavigatorbig.CategoriesSection.categories_electronic;
import com.example.bottomnavigatorbig.CategoriesSection.categories_fashion;
import com.example.bottomnavigatorbig.CategoriesSection.categories_fireDrops;
import com.example.bottomnavigatorbig.CategoriesSection.categories_flightsandhotel;
import com.example.bottomnavigatorbig.CategoriesSection.categories_furniture;
import com.example.bottomnavigatorbig.CategoriesSection.categories_giftCard;
import com.example.bottomnavigatorbig.CategoriesSection.categories_home;
import com.example.bottomnavigatorbig.CategoriesSection.categories_homeServices;
import com.example.bottomnavigatorbig.CategoriesSection.categories_insurance;
import com.example.bottomnavigatorbig.CategoriesSection.categories_liveshops;
import com.example.bottomnavigatorbig.CategoriesSection.categories_medicine;
import com.example.bottomnavigatorbig.CategoriesSection.categories_mobiles;
import com.example.bottomnavigatorbig.CategoriesSection.categories_nutrition;
import com.example.bottomnavigatorbig.CategoriesSection.categories_offerzone;
import com.example.bottomnavigatorbig.CategoriesSection.categories_personalcare;
import com.example.bottomnavigatorbig.CategoriesSection.categories_pluszone;
import com.example.bottomnavigatorbig.CategoriesSection.categories_sellBack;
import com.example.bottomnavigatorbig.CategoriesSection.categories_sports;
import com.example.bottomnavigatorbig.CategoriesSection.categories_supercoin;
import com.example.bottomnavigatorbig.CategoriesSection.categories_toysandbear;
import com.example.bottomnavigatorbig.CategoriesSection.categories_whatsnew;
import com.example.bottomnavigatorbig.CategoriesSection.flipkartOriginal;
import com.example.bottomnavigatorbig.CategoriesSection.flipkartSamarth;
import com.example.bottomnavigatorbig.CategoriesSection.flipkartgreen;
import com.example.bottomnavigatorbig.CategoriesSection.flipkartweeding;
import com.example.bottomnavigatorbig.HomeSection.home_grocery;


public class BFragment extends Fragment {


    public BFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.categories_b, container, false);



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView btnoffer  = view.findViewById(R.id.btnoffer);
        btnoffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_offerzone(), false);

            }
        });





        ImageView btnmobile = view.findViewById(R.id.btnMobile);
        btnmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_mobiles(), false);
            }
        });




        ImageView btngrocery = view.findViewById(R.id.btngrocery);
        btngrocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new home_grocery(), false);
            }
        });



        ImageView btnfashion = view.findViewById(R.id.btnfashion);
        btnfashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_fashion(), false);
            }
        });





        ImageView btnelectroinc = view.findViewById(R.id.btnelectronic);
        btnelectroinc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_electronic(), false);
            }
        });


        ImageView btnhome = view.findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_home(), false);
            }
        });




        ImageView btnpersonalCare = view.findViewById(R.id.btnpersonalCare);
        btnpersonalCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_personalcare(), false);
            }
        });





        ImageView btnAppliances = view.findViewById(R.id.btnappliances);
        btnAppliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_appliances(), false);
            }
        });


        ImageView btntoy = view.findViewById(R.id.btntoy);
        btntoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_toysandbear(), false);
            }
        });



        ImageView btnfurniture = view.findViewById(R.id.btnfurniture);
        btnfurniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_furniture(), false);
            }
        });


        ImageView btnflights = view.findViewById(R.id.btnfights);
        btnflights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_flightsandhotel(), false);
            }
        });


        ImageView btnInsurance = view.findViewById(R.id.btnInsurance);
        btnInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_insurance(), false);
            }
        });




        ImageView btnsports = view.findViewById(R.id.btnsports);
        btnsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_sports(), false);
            }
        });



        ImageView btnnutrition = view.findViewById(R.id.btnnutrition);
        btnnutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_nutrition(), false);
            }
        });



        ImageView btnbikes = view.findViewById(R.id.btnbikes);
        btnbikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_bikesandcar(), false);
            }
        });



        ImageView btngifts = view.findViewById(R.id.btngifts);
        btngifts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_giftCard(), false);
            }
        });



        ImageView btnmedicine = view.findViewById(R.id.btnmedicine);
        btnmedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_medicine(), false);
            }
        });


        ImageView btnhomeservice = view.findViewById(R.id.btnhomeservice);
        btnhomeservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_homeServices(), false);
            }
        });



        ImageView btnsellback = view.findViewById(R.id.btnsellback);
        btnsellback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_sellBack(), false);
            }
        });




        ImageView btnsupercoin = view.findViewById(R.id.btnsupercoin);
        btnsupercoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_supercoin(), false);
            }
        });



        ImageView btncoupon = view.findViewById(R.id.btncoupon);
        btncoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_coupon(), false);
            }
        });



        ImageView btnfeed = view.findViewById(R.id.btnfeed);




        ImageView  btncredit = view.findViewById(R.id.btncredit);
        btncredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_credit(), false);
            }
        });


        ImageView btnwhatsnew = view.findViewById(R.id.btnwhatsnew);
        btnwhatsnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_whatsnew(), false);
            }
        });



        ImageView btnfiredrop = view.findViewById(R.id.btnfiredrop);
        btnfiredrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_fireDrops(), false);
            }
        });




        ImageView btncamera = view.findViewById(R.id.btncamera);
        btncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_camera(), false);
            }
        });




        ImageView btngames = view.findViewById(R.id.btngames);
        btngames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_Games(), false);
            }
        });




//        ImageView sellerr = view.findViewById(R.id.sellerrrr);
//        sellerr.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((MainActivity)getActivity()).loadFrag(new categories_sellBack(), false);
//            }
//        });



        ImageView btnliveshop = view.findViewById(R.id.btnliveshop);
        btnliveshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_liveshops(), false);
            }
        });





        ImageView btnpluszone = view.findViewById(R.id.btnpluszone);
        btnpluszone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new categories_pluszone(), false);
            }
        });





        ImageView flipkartoriginal = view.findViewById(R.id.flipkartoriginal);
        flipkartoriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartOriginal(), false);
            }
        });





        ImageView flipkartsamarth = view.findViewById(R.id.flipkartsamarth);
        flipkartsamarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartSamarth(), false);
            }
        });




        ImageView flipkartgreen = view.findViewById(R.id.flipkartgreen);
        flipkartgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartgreen(), false);
            }
        });




        ImageView flipkartweeding = view.findViewById(R.id.flipkartweeding);
        flipkartweeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartweeding(), false);
            }
        });





        ImageView internationalstore = view.findViewById(R.id.internationalstore);
        internationalstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartOriginal(), false);
            }
        });






        ImageView winter = view.findViewById(R.id.winter);
        winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartSamarth(), false);
            }
        });




        ImageView travelstore = view.findViewById(R.id.travelstore);
        travelstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartgreen(), false);
            }
        });






        ImageView launchhub = view.findViewById(R.id.launchhub);
        launchhub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).loadFrag(new flipkartweeding(), false);
            }
        });







    }







}

