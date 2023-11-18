package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class RAM extends Characteristics implements Displayable {
  private int speed; // Replaced power with speed
  private int capacity;
  private String memoryType;

  public static RAM[] RAMsCreat() {
    RAM[] rams = new RAM[7];

    rams[0] = new RAM(79.99, "G.Skill", "Trident Z RGB 16GB", 2022, 3600, 16, "DDR4");
    rams[1] = new RAM(99.99, "Corsair", "Vengeance LPX 32GB", 2022, 3200, 32, "DDR4");
    rams[2] = new RAM(149.99, "Crucial", "Ballistix MAX 64GB", 2022, 4000, 64, "DDR4");
    rams[3] = new RAM(59.99, "Kingston", "HyperX Predator 8GB", 2022, 3200, 8, "DDR4");
    rams[4] = new RAM(199.99, "Corsair", "Dominatоr Platinum RGB 128GB", 2022, 4800, 128, "DDR4");
    rams[5] = new RAM(89.99, "ADATA", "XPG Spectrix D60G 32GB", 2022, 3600, 32, "DDR4");
    rams[6] = new RAM(69.99, "Team Group", "T-Force Delta RGB 16GB", 2022, 3200, 16, "DDR4");

    return rams;
  }


  public RAM(double price, String brand, String model, int year, int speed, int capacity, String memoryType) {
    super(price, brand, model, year);
    this.speed = speed;
    this.capacity = capacity;
    this.memoryType = memoryType;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  public String getMemoryType() {
    return memoryType;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Оперативна пам'ять" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість=" + speed +
          ", Обсяг пам'яті=" + capacity+"ГБ" +
          ", Тип пам'яті=" + memoryType;
    } else {
      return "" + getModel() + '\'';
    }
  }
}
