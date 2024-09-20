package com.example.homes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homes.Models.HousesModels;
import com.example.homes.R;

import java.util.ArrayList;

public class HousesAdapter extends RecyclerView.Adapter<HousesAdapter.MyViewHolder> {
  Context context;
  ArrayList<HousesModels> housesModels;

  public HousesAdapter(Context context, ArrayList<HousesModels> housesModels) {
    this.context = context;
    this.housesModels = housesModels;
  }

  @NonNull
  @Override
  public HousesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater layoutInflater = LayoutInflater.from(context);
    View view = layoutInflater.inflate(R.layout.houses_available, parent, false);

    return new HousesAdapter.MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull HousesAdapter.MyViewHolder holder, int position) {
    holder.titleTextView.setText(housesModels.get(position).getTitle());
    holder.ratingTextView.setText(housesModels.get(position).getRating());
    holder.climateTextView.setText(housesModels.get(position).getClimate());
    holder.milesTextView.setText(housesModels.get(position).getMiles());
    holder.estimatedTimeTextView.setText(housesModels.get(position).getEstimatedTime());
    holder.imageView.setImageResource(housesModels.get(position).getHouseImages());
  }

  @Override
  public int getItemCount() {
    return housesModels.size();
  }

  public static class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView titleTextView, ratingTextView, climateTextView, milesTextView, estimatedTimeTextView;

    public MyViewHolder(@NonNull View itemView) {
      super(itemView);

      imageView = itemView.findViewById(R.id.imageViewHousesAvailable);
      titleTextView = itemView.findViewById(R.id.titleTextView);
      ratingTextView = itemView.findViewById(R.id.reviewHousesTextView);
      milesTextView = itemView.findViewById(R.id.milesHousesTextView);
      climateTextView = itemView.findViewById(R.id.temperatureHousesTextView);
      estimatedTimeTextView = itemView.findViewById(R.id.estimateArrivalHousesTextView);
    }
  }
}
