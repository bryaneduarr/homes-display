package com.example.homes.Models;

import androidx.annotation.NonNull;

public class FilterModels {
  private String vectorIcon;
  private String description;
  private int id;

  public FilterModels(String vectorIcon, String description, int id) {
    this.vectorIcon = vectorIcon;
    this.description = description;
    this.id = id;
  }

  @NonNull
  @Override
  public String toString() {
    return "Filter{" +
      "description='" + description + '\'' +
      '}';
  }

  public String getVectorIcon() {
    return vectorIcon;
  }

  public void setVectorIcon(String vectorIcon) {
    this.vectorIcon = vectorIcon;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
