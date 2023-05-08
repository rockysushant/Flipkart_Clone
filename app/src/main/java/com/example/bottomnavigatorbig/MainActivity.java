package com.example.bottomnavigatorbig;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic("notification");

        bnView = findViewById(R.id.bnView);


        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();



                if(id==R.id.nav_home){
                loadFrag(new AFragment(),false);   // sab true ko false kiye hai
                getSupportActionBar().hide();


                }else if(id==R.id.nav_categories){

                    loadFrag(new BFragment(),false);
                    getSupportActionBar().show();
//                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
                    getSupportActionBar().setTitle(" All Categories");


                }else if(id==R.id.nav_notification){
                    loadFrag(new CFragment(),false);
                    getSupportActionBar().show();
                    getSupportActionBar().setTitle("Notification");

                }else if(id==R.id.nav_cart){
                        loadFrag(new DFragment(),false);
                    getSupportActionBar().show();
                        getSupportActionBar().setTitle("Cart");

                }else if(id==R.id.nav_account){
                    loadFrag( new EFragment(),false);
                    getSupportActionBar().show();
                    getSupportActionBar().setTitle("Account");

                }
                return true;

            }
        });

        bnView.setSelectedItemId(R.id.nav_home);

    }
    @SuppressLint("SuspiciousIndentation")
    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
            if(flag) {
            ft.add(R.id.container, fragment);
            fm.popBackStack();
        }else
            ft.replace(R.id.container,fragment);
            ft.addToBackStack(null);
            ft.commit();

    }

}