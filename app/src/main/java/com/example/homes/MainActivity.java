package com.example.homes;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homes.Adapter.FilterAdapter;
import com.example.homes.Adapter.HousesAdapter;
import com.example.homes.Models.FilterModels;
import com.example.homes.Models.HousesModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ArrayList<HousesModels> housesModels = new ArrayList<>();
  int[] houseImages = {R.drawable.house_1,
    R.drawable.house_2, R.drawable.house_3};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
      Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      return insets;
    });
    RecyclerView recyclerView = findViewById(R.id.recyclerView);
    RecyclerView recyclerView2 = findViewById(R.id.recyclerView2j);

    ArrayList<FilterModels> filterModels = new ArrayList<>();

    filterModels.add(new FilterModels("map_pin_alt_svgrepo_com", "Nearby", 1));
    filterModels.add(new FilterModels("mountain_2_svgrepo_com", "Epic Views", 2));
    filterModels.add(new FilterModels("trees_svgrepo_com", "Among Trees", 3));
    filterModels.add(new FilterModels("city_svgrepo_com", "City", 4));

    FilterAdapter filterAdapter = new FilterAdapter(this, filterModels);
    recyclerView.setAdapter(filterAdapter);

    HousesAdapter housesAdapter = new HousesAdapter(this, housesModels);
    recyclerView2.setAdapter(housesAdapter);
    recyclerView2.setLayoutManager(new LinearLayoutManager(this));

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
    recyclerView.setLayoutManager(linearLayoutManager);

    setHousesModels();
  }

  private void setHousesModels() {
    String[] titleHouses = getResources().getStringArray(R.array.title_houses);
    String[] ratingHouses = getResources().getStringArray(R.array.rating_houses);
    String[] climateHouses = getResources().getStringArray(R.array.climate_houses);
    String[] milesHouses = getResources().getStringArray(R.array.miles_houses);
    String[] estimatedTimeHouses = getResources().getStringArray(R.array.estimated_houses);

    for (int i = 0; i < titleHouses.length; i++) {
      housesModels.add(new HousesModels(titleHouses[i],
        ratingHouses[i], climateHouses[i], milesHouses[i], estimatedTimeHouses[i],
        houseImages[i]));
    }
  }
}