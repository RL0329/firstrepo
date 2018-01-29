package com.example.ayabeltran.furnitureapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter {

    private ArrayList<Items> furnitures;
    private Context c;


    public RecyclerAdapter(ArrayList<Items>furnitures, Context c) {
        this.furnitures= furnitures;
        this.c = c;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView displaytitle;
        TextView displaycost;
        TextView displaydesc;
        ImageView dispimg;
        Items selectedItem;

        public MyViewHolder(View itemView) {
            super(itemView);
            displaytitle = itemView.findViewById(R.id.furniturename);
            displaycost = itemView.findViewById(R.id.furnitureprice);
            displaydesc = itemView.findViewById(R.id.furnituredescription);
            dispimg = itemView.findViewById(R.id.furnitureimage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent preview = new Intent(c, MaximizedView.class);
                    preview.putExtra("Key", selectedItem.getName());
                    preview.putExtra("Key2", selectedItem.getCost());
                    preview.putExtra("Key3", selectedItem.getDetails());
                    preview.putExtra("Key4", selectedItem.getImage());
                    c.startActivity(preview);

                }
            });
        }

            public String toString() {
                return super.toString();

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View furnitureView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_maximized_view, parent, false);
        return new MyViewHolder(furnitureView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder) holder).displaytitle.setText(furnitures.get(position).getName());
        ((MyViewHolder) holder).displaycost.setText(furnitures.get(position).getCost());
        ((MyViewHolder) holder).displaydesc.setText(furnitures.get(position).getDetails());
        ((MyViewHolder) holder).dispimg.setImageResource(furnitures.get(position).getImage());
        ((MyViewHolder) holder).selectedItem = furnitures.get(position);
    }

    @Override
    public int getItemCount() {
        return furnitures.size();
    }
}
