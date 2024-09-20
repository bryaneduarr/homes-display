package com.example.homes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homes.Models.FilterModels;
import com.example.homes.databinding.ViewHolderFiltersBinding;

import java.util.ArrayList;

public class FilterAdapter extends RecyclerView.Adapter<FilterAdapter.ViewHolder> {
  ArrayList<FilterModels> items;
  Context context;

  public FilterAdapter(Context context, ArrayList<FilterModels> items) {
    this.context = context;
    this.items = items;
  }

  @NonNull
  @Override
  public FilterAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    ViewHolderFiltersBinding binding = ViewHolderFiltersBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

    return new ViewHolder(binding);
  }

  @Override
  public void onBindViewHolder(@NonNull FilterAdapter.ViewHolder holder, int position) {
    FilterModels filterModels = items.get(position);

    holder.binding.textView.setText(filterModels.getDescription());

    int iconResId = context.getResources()
      .getIdentifier(filterModels.getVectorIcon(), "drawable", context.getPackageName());
    holder.binding.imageView.setImageResource(iconResId);
  }

  @Override
  public int getItemCount() {
    return items.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    ViewHolderFiltersBinding binding;

    public ViewHolder(ViewHolderFiltersBinding binding) {
      super(binding.getRoot());

      this.binding = binding;
    }
  }
}
