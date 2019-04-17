package com.example.inf1rmation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.sql.Driver;
import java.util.List;

public class DriverAdapter extends RecyclerView.Adapter<DriverAdapter.MyViewHolder> {
    private Context context;
    private List<Driver> drivers;
    private RecyclerViewClickListener recyclerViewClickListener;


//    public DriverAdapter(Context context, List<Driver> drivers, RecyclerViewClickListener listener) {
//        this.context = context;
//        this.drivers = drivers;
//        recyclerViewClickListener = listener;
//    }

    public DriverAdapter(MainActivity context, List<Driver> drivers, RecyclerViewClickListener listener) {
        this.context = context;
        this.drivers = drivers;
        recyclerViewClickListener = listener;
    }


    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    //creates the ViewHolder by inflating the CardView layout and returning it
    @Override
    public DriverAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        return new MyViewHolder(itemView, recyclerViewClickListener);
    }

    //Assigns the appropriate information from the recipe object to each widget in the CardView
    //the holder is created as an inner class
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        Driver driver = drivers.get(position);
//        holder.name.setText(com.example.inf1rmation.Driver.getname());
//        holder.team.setText(driver.getTeam());


        //Picasso.with(context).load(driver.getThumbnail()).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
            return drivers.size();

    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        private TextView name, team, position;

        private RecyclerViewClickListener recyclerViewClickListener;

        //wire the items in the CardView to instance variables
        public MyViewHolder(View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            team = itemView.findViewById(R.id.team);
            position = itemView.findViewById(R.id.position);
            position.setOnClickListener(this);
            name.setOnClickListener(this);
            recyclerViewClickListener = listener;
            itemView.setOnClickListener(this); //can go on any of the individual items instead.
        }


        @Override
        public void onClick(View view) {
            recyclerViewClickListener.onClick(view, getAdapterPosition());
        }
    }

}
