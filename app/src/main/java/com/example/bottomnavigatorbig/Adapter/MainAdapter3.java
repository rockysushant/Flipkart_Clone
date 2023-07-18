package com.example.bottomnavigatorbig.Adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigatorbig.Model.MainModel3;
import com.example.bottomnavigatorbig.R;

import java.util.ArrayList;

public class MainAdapter3 extends  RecyclerView.Adapter<MainAdapter3.ViewHolder> {


    ArrayList<MainModel3> mainModels3;
    Context context;
    OnItemClick onItemClick;


    public MainAdapter3(Context context, ArrayList<MainModel3> mainModels3, OnItemClick onItemClick) {
        this.context = context;
        this.mainModels3 = mainModels3;
        this.onItemClick = onItemClick;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //create view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);


    }


    interface OnItemClick{
        void onClick(int position );


    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        //set Logo to imageview

        holder.imageView.setImageResource(mainModels3.get(position).getLangLogo());
        //set name to textView

//        holder.textView.setText(mainModels.get(position).getLangName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onItemClick.onClick(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mainModels3.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        //initialize variable

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //assign variable
            imageView = itemView.findViewById(R.id.image_view);
//            imageView = itemView.findViewById(R.id.image_view2);
//            textView = itemView.findViewById(R.id.text_view);
        }
    }
}