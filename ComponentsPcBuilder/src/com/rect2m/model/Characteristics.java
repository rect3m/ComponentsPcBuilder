package com.rect2m.model;

public abstract class Characteristics {
  
  private double price;
  private String brand;
  private String model;
  private int year;
  
  public Characteristics(double price, String brand, String model, int year) {
    this.price = price;
    this.brand = brand;
    this.model = model;
    this.year = year;
  }
  
  public double getPrice() {
    return price;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getYear() {
    return year;
  }
}