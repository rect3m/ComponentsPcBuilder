package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class PSU extends Characteristics implements Displayable {
  private int power; // Replaced frequency with power

  public static PSU[] PSUsCreat(){
    PSU[] psus = new PSU[7];

    psus[0] = new PSU(119.99, "NZXT", "C750", 2022, 750);
    psus[1] = new PSU(139.99, "Seasonic", "Focus PX-850", 2022, 850);
    psus[2] = new PSU(159.99, "Corsair", "RM850x", 2022, 850);
    psus[3] = new PSU(99.99, "EVGA", "500 W1", 2022, 500);
    psus[4] = new PSU(89.99, "Thermaltake", "Smart BX1 550W", 2022, 550);
    psus[5] = new PSU(119.99, "be quiet!", "Straight Power 11 750W", 2022, 750);
    psus[6] = new PSU(104.99, "Antec", "NeoECO Gold Zen 600W", 2022, 600);

    return psus;
  }


  public PSU(double price, String brand, String model, int year, int power) {
    super(price, brand, model, year);
    this.power = power;
  }
  
  public int getPower() {
    return power;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Блок живлення" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Потужність=" + power;
    } else {
      return "" + getModel() + '\'';
    }
  }
}