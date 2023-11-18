package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class Cooling extends Characteristics implements Displayable {
  private int fanSpeed; // Replaced speed with fan speed
  private String coolingType; // Added cooling type (liquid or air)
  private int thermalPower; // Replaced memory capacity with thermal dissipation power

  public static Cooling[] CoolingsCreat() {
    Cooling[] coolings = new Cooling[7];

    coolings[0] = new Cooling(79.99, "Arctic", "Liquid Freezer II 360", 2021, 2200, "Liquid", 280);
    coolings[1] = new Cooling(59.99, "Noctua", "NH-U12S", 2021, 1200, "Air", 160);
    coolings[2] = new Cooling(139.99, "Corsair", "iCUE H150i Elite Capellix", 2021, 2800, "Liquid", 320);
    coolings[3] = new Cooling(39.99, "Cooler Master", "Hyper 212 RGB", 2021, 1800, "Air", 200);
    coolings[4] = new Cooling(169.99, "NZXT", "Kraken Z63", 2021, 2600, "Liquid", 300);
    coolings[5] = new Cooling(89.99, "be quiet!", "Dark Rock 4", 2021, 1500, "Air", 180);
    coolings[6] = new Cooling(119.99, "Deepcool", "Castle 240EX", 2021, 2000, "Liquid", 240);

    return coolings;
  }

  public Cooling(double price, String brand, String model, int year, int fanSpeed, String coolingType, int thermalPower) {
    super(price, brand, model, year);
    this.fanSpeed = fanSpeed;
    this.coolingType = coolingType;
    this.thermalPower = thermalPower;
  }
  
  public int getFanSpeed() {
    return fanSpeed;
  }
  
  public String getCoolingType() {
    return coolingType;
  }
  
  public int getThermalPower() {
    return thermalPower;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Система охолодження" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість обертів=" + fanSpeed +
          ", Тип охолодження=" + coolingType +
          ", Потужність тепловідводу=" + thermalPower;
    } else {
      return "" + getModel() + '\'';
    }
  }
}
