package com.example.homes.Models;

public class HousesModels {
  private final int houseImages;
  private String title;
  private String rating;
  private String climate;
  private String miles;
  private String estimatedTime;

  public HousesModels(
    String title, String rating, String climate,
    String miles, String estimatedTime, int houseImages) {
    this.title = title;
    this.rating = rating;
    this.climate = climate;
    this.miles = miles;
    this.estimatedTime = estimatedTime;
    this.houseImages = houseImages;
  }

  public int getHouseImages() {
    return houseImages;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getClimate() {
    return climate;
  }

  public void setClimate(String climate) {
    this.climate = climate;
  }

  public String getMiles() {
    return miles;
  }

  public void setMiles(String miles) {
    this.miles = miles;
  }

  public String getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
  }
}
