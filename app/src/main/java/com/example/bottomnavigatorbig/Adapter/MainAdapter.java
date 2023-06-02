package com.example.bottomnavigatorbig.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigatorbig.Model.MainModel;
import com.example.bottomnavigatorbig.R;

import java.util.ArrayList;

public class MainAdapter extends  RecyclerView.Adapter<MainAdapter.ViewHolder> {


    ArrayList<MainModel> mainModels;
    Context context;

    OnItemClick onItemClick;


    public MainAdapter(Context context, ArrayList<MainModel> mainModels, OnItemClick onItemClick) {
        this.context = context;
        this.mainModels = mainModels;
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


     public interface OnItemClick{
         void onClick(int position );




    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //set Logo to imageview

        holder.imageView.setImageResource(mainModels.get(position).getLangLogo());
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
        return mainModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        //initializw variable

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
