package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class Processor extends Characteristics implements Displayable {
  private int frequency;
  private String socet;
  public static Processor[] ProcessorsCreat(){
    Processor[] processors = new Processor[7];

    processors[0] = new Processor(329.99, "AMD", "Ryzen 5 5600X", 2022, 4700, "AM4");
    processors[1] = new Processor(449.99, "Intel", "i7-12700K", 2022, 5000, "LGA1700");
    processors[2] = new Processor(579.99, "AMD", "Ryzen 9 5900X", 2022, 4800, "AM4");
    processors[3] = new Processor(379.99, "Intel", "i5-12600K", 2022, 4600, "LGA1700");
    processors[4] = new Processor(289.99, "AMD", "Ryzen 5 5600", 2022, 4200, "AM4");
    processors[5] = new Processor(369.99, "Intel", "i5-12400F", 2022, 4100, "LGA1700");
    processors[6] = new Processor(259.99, "AMD", "Ryzen 5 3600X", 2021, 3800, "AM4");

    return processors;
  }

  public Processor(double price, String brand, String model, int year, int frequency,String socet) {
    super(price, brand, model, year);
    this.frequency = frequency;
    this.socet =socet;
  }
  public String getSocet(){
    return socet;
  }
  public int getFrequency() {
    return frequency;
  }
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Процессор" + " "+
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Частота=" + frequency +
          ", Сокет="+ socet;
    } else {
      return  "" + getModel() + '\'';
    }
  }
}
