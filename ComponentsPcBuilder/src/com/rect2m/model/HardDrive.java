package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class HardDrive extends Characteristics implements Displayable {
  private int speed; // Replaced power with speed
  private int capacity;

  public static HardDrive[] HardDrivesCreat() {
    HardDrive[] hardDrives = new HardDrive[7];

    hardDrives[0] = new HardDrive(89.99, "Western Digital", "WD Black 1TB", 2021, 7200, 1000);
    hardDrives[1] = new HardDrive(119.99, "Seagate", "IronWolf 4TB", 2021, 5900, 4000);
    hardDrives[2] = new HardDrive(149.99, "Samsung", "970 EVO Plus 1TB", 2021, 3500, 1000);
    hardDrives[3] = new HardDrive(79.99, "Crucial", "P5 500GB", 2021, 6600, 500);
    hardDrives[4] = new HardDrive(169.99, "Seagate", "BarraCuda Pro 4TB", 2021, 7200, 4000);
    hardDrives[5] = new HardDrive(99.99, "Kingston", "KC2500 1TB", 2021, 3500, 1000);
    hardDrives[6] = new HardDrive(139.99, "SanDisk", "Extreme PRO 1TB", 2021, 5500, 1000);

    return hardDrives;
  }


  public HardDrive(double price, String brand, String model, int year, int speed, int capacity) {
    super(price, brand, model, year);
    this.speed = speed;
    this.capacity = capacity;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Жорсткий диск" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість=" + speed +
          ", Обсяг пам'яті=" + capacity;
    } else {
      return "" + getModel() + '\'';
    }
  }
}