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
import android.widget.Button;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class AFragment extends Fragment implements MainAdapter.OnItemClick, MainAdapter2.OnItemClickNew {


    BottomNavigationView bnView;
    ImageSlider imageSlider;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    ArrayList<MainModel> mainModels;
    ArrayList<MainModel2> mainModels2;
    MainAdapter mainAdapter;
    MainAdapter2 mainAdapter2;


    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_a, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView smallFlipkart = view.findViewById(R.id.smallFlipkart);
        ImageView grocery = view.findViewById(R.id.grocery);


        // SMALL FLIPKART  BUTTON


//        smallFlipkart.setOnClickListener(new View.OnClickListener() {

//            @Override
//            public void onClick(View view) {
//                ((MainActivity) getActivity()).loadFrag(new flipkart_home(), false);   //change
//
////                smallFlipkart.setBackgroundColor(getResources().getColor(R.color.black));
////                grocery.setBackgroundColor(getResources().getColor(R.color.white));
//
//            }
//        });


        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

//                grocery.setBackgroundColor(getResources().getColor(R.color.black));
//                smallFlipkart.setBackgroundColor(getResources().getColor(R.color.white));

            }
        });


        ImageView home_boat = view.findViewById(R.id.home_boat);
        home_boat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_boat(), false);
            }
        });


        ImageView boat2 = view.findViewById(R.id.boat2);
        boat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_boat(), false);
            }
        });



        ImageView home_fitshot = view.findViewById(R.id.home_fitshot);
        home_fitshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_fitshot(), false);
            }
        });


        ImageView home_happilo = view.findViewById(R.id.home_happilo);
        home_happilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_happilo(), false);
            }
        });


        ImageView boult = view.findViewById(R.id.boult);
        boult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_boult(), false);
            }
        });


        ImageView aeroborne = view.findViewById(R.id.aeroborne);
        aeroborne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_aeroborne(), false);
            }
        });


        ImageView shoe = view.findViewById(R.id.shoe);
        shoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_shoe(), false);
            }
        });


        ImageView flights = view.findViewById(R.id.flights);
        flights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new categories_flightsandhotel(), false);
            }
        });


//        MEDICINE


        ImageView medicine = view.findViewById(R.id.medicine);
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new categories_medicine(), false);

            }
        });

        ImageView medicine2 = view.findViewById(R.id.medicine2);
        medicine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new categories_medicine(), false);

            }
        });


        ImageView tv = view.findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_tv(), false);

            }
        });

        ImageView wheat = view.findViewById(R.id.wheat);
        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });


        ImageView toy = view.findViewById(R.id.toy);
        toy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_toy(), false);

            }
        });

        ImageView decoration = view.findViewById(R.id.decoration);
        decoration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_toy(), false);

            }
        });





        ImageView homeGrocery = view.findViewById(R.id.homeGrocery);
        homeGrocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });


        ImageView homeGrocerycola = view.findViewById(R.id.homeGrocerycola);
        homeGrocerycola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });

        ImageView tata = view.findViewById(R.id.tata);
        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });


        ImageView fortune = view.findViewById(R.id.fortune);
        fortune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });


        ImageView sponsoredCard = view.findViewById(R.id.sponsoredCard);
        sponsoredCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_sbiCard(), false);

            }
        });


        ImageView cardOne = view.findViewById(R.id.cardOne);
        cardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_sbiCard(), false);

            }
        });


        ImageView cardtwo = view.findViewById(R.id.cardtwo);
        cardtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_sbiCard(), false);

            }
        });


        ImageView cardthree = view.findViewById(R.id.cardthree);
        cardthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_sbiCard(), false);

            }
        });


        ImageView recboat = view.findViewById(R.id.recboat);
        recboat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_boat(), false);

            }
        });


        ImageView recfitshot = view.findViewById(R.id.recfitshot);
        recfitshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_fitshot(), false);

            }
        });



        ImageView recboult = view.findViewById(R.id.recboult);
        recboult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_boult(), false);

            }
        });




        ImageView recboattwo = view.findViewById(R.id.recboattwo);
        recboattwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_boat(), false);

            }
        });


        ImageView personal = view.findViewById(R.id.personal);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new categories_personalcare(), false);

            }
        });



        ImageView fitness = view.findViewById(R.id.fitness);
        fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });


        ImageView chasmna = view.findViewById(R.id.chasmna);
        chasmna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new categories_sports(), false);

            }
        });




        ImageView dryfruit = view.findViewById(R.id.dryfruit);
        dryfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

            }
        });

        //RECYCLER VIEW 1

        recyclerView = view.findViewById(R.id.recycler_view);

        //create Integer array
        Integer[] langLogo =
                {R.drawable.supercoin,
                        R.drawable.coupon,
                        R.drawable.feed,
                        R.drawable.credit,
                        R.drawable.whatsnew,
                        R.drawable.firedrop,
                        R.drawable.camera,
                        R.drawable.games,
                        R.drawable.liveshop
                        , R.drawable.plusxone,
                        R.drawable.supercoin,
                        R.drawable.coupon,
                        R.drawable.feed
                        , R.drawable.credit};


        //create String array

//        String[] langName = {"android", "angular","c","html", "java","javascript","json","jsshs","vobotstarp","hello","kdjyr","bcudicu"};


        //initialize arrayList

        mainModels = new ArrayList<>();
        for (int i = 0; i < langLogo.length; i++) {
            MainModel model = new MainModel(langLogo[i], null);
            mainModels.add(model);

        }

        //Design Horizontal Layout

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                requireActivity(), LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        //initialize mainAdapter
        mainAdapter = new MainAdapter(requireActivity(), mainModels, this);

        //set mainAdapter to recyclerview
        recyclerView.setAdapter(mainAdapter);


        //RECYCLER VIEW 2


        recyclerView2 = view.findViewById(R.id.recycler_view2);
        //create Integer array
        Integer[] langLogos =
                {R.drawable.rvone,
                        R.drawable.rvtwo,
                        R.drawable.rvfive,
                        R.drawable.rvfour,
                        R.drawable.rvthree,
                        R.drawable.rvsix,
                        R.drawable.rvseven,
                        R.drawable.rvone,
                        R.drawable.rvfive
                };


        bnView = view.findViewById(R.id.bnView);


        //initialize arrayList

        mainModels2 = new ArrayList<>();
        for (int i = 0; i < langLogos.length; i++) {
            MainModel2 model = new MainModel2(langLogos[i], null);
            mainModels2.add(model);

        }

        //Design Horizontal Layout

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(
                requireActivity(), LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());


        //initialize mainAdapter
        mainAdapter2 = new MainAdapter2(requireActivity(), mainModels2, this);

        //set mainAdapter to recyclerview
        recyclerView2.setAdapter(mainAdapter2);


//        IMAGE SLIDER

        imageSlider = view.findViewById(R.id.homeImage_slider);


        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.imageslidereleven, null));
        imageList.add(new SlideModel(R.drawable.imageslide2, null));
        imageList.add(new SlideModel(R.drawable.imageslider16, null));
        imageList.add(new SlideModel(R.drawable.imageslider17, null));
        imageList.add(new SlideModel(R.drawable.imageslider15, null));
        imageList.add(new SlideModel(R.drawable.imageslider14, null));

        imageSlider.setImageList(imageList);
    }


    @Override
    public void onClick(int position) {

        if (position == 0) {
            ((MainActivity) getActivity()).loadFrag(new categories_supercoin(), false);

        } else if (position == 1) {
            ((MainActivity) getActivity()).loadFrag(new categories_coupon(), false);

        } else if (position == 2) {
            ((MainActivity) getActivity()).loadFrag(new categories_feed(), false);

        } else if (position == 3) {
            ((MainActivity) getActivity()).loadFrag(new categories_credit(), false);

        } else if (position == 4) {
            ((MainActivity) getActivity()).loadFrag(new categories_whatsnew(), false);

        } else if (position == 5) {
            ((MainActivity) getActivity()).loadFrag(new categories_fireDrops(), false);

        } else if (position == 6) {
            ((MainActivity) getActivity()).loadFrag(new categories_camera(), false);

        } else if (position == 7) {
            ((MainActivity) getActivity()).loadFrag(new categories_Games(), false);

        } else if (position == 8) {
            ((MainActivity) getActivity()).loadFrag(new categories_liveshops(), false);

        } else if (position == 9) {
            ((MainActivity) getActivity()).loadFrag(new categories_pluszone(), false);

        }


    }

    @Override
    public void onClickNew(int position) {


        if (position == 0) {
            ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

        }else if (position == 1) {
            ((MainActivity) getActivity()).loadFrag(new home_shoe(), false);

        } else if (position == 2) {
            ((MainActivity) getActivity()).loadFrag(new categories_mobiles(), false);

        } else if (position == 3) {
            ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

        } else if (position == 4) {
            ((MainActivity) getActivity()).loadFrag(new home_boult(), false);

        } else if (position == 5) {
            ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

        } else if (position == 6) {
            ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

        } else if (position == 7) {
            ((MainActivity) getActivity()).loadFrag(new home_grocery(), false);

        } else if (position == 8) {
            ((MainActivity) getActivity()).loadFrag(new categories_mobiles(), false);

        }
    }
}

