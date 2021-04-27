package com.project_work.challenge_fragandrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Car_Adapter extends RecyclerView.Adapter<Car_Adapter.ViewHolder> {

    public ArrayList<Cars_class> car;
    ItemSelected activity;
    interface ItemSelected
    {
        void onItemClicked(int index);
    }
    public Car_Adapter(Context context,ArrayList<Cars_class> list)
    {
        car=list;
        activity=(ItemSelected) context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView i_car_name;
        TextView i_owner_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            i_car_name=itemView.findViewById(R.id.i_car_name);
            i_owner_name=itemView.findViewById(R.id.i_owner_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(car.indexOf((Cars_class) v.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public Car_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Car_Adapter.ViewHolder holder, int position) {
        holder.itemView.setTag(car.get(position));
        holder.i_car_name.setText(car.get(position).getCar_name());
        holder.i_owner_name.setText(car.get(position).getCar_owner());
    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
