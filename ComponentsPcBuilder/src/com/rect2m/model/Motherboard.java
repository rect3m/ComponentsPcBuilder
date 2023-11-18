package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class Motherboard extends Characteristics implements Displayable {
  private String socketType;
  private String formFactor;

  public static Motherboard[] MotherboardsCreat() {
    Motherboard[] motherboards = new Motherboard[7];

    motherboards[0] = new Motherboard(179.99, "ASUS", "ROG Crosshair VIII Hero", 2022, "AM4", "ATX");
    motherboards[1] = new Motherboard(139.99, "GIGABYTE", "B560 AORUS PRO AX", 2022, "LGA1200", "ATX");
    motherboards[2] = new Motherboard(109.99, "MSI", "MAG B450 TOMAHAWK MAX", 2021, "AM4", "ATX");
    motherboards[3] = new Motherboard(199.99, "ASRock", "X570 Taichi", 2022, "AM4", "ATX");
    motherboards[4] = new Motherboard(89.99, "ASUS", "TUF Gaming B550M-PLUS (Wi-Fi 6)", 2021, "AM4", "MicroATX");
    motherboards[5] = new Motherboard(169.99, "MSI", "MPG B550 Gaming Edge WiFi", 2021, "AM4", "ATX");
    motherboards[6] = new Motherboard(79.99, "GIGABYTE", "H410M DS2V", 2021, "LGA1200", "MicroATX");

    return motherboards;
  }


  public Motherboard(double price, String brand, String model, int year, String socketType, String formFactor) {
    super(price, brand, model, year);
    this.socketType = socketType;
    this.formFactor = formFactor;
  }
  
  public String getSocketType() {
    return socketType;
  }
  
  public String getFormFactor() {
    return formFactor;
  }
  
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Материнська плата" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Сокет='" + socketType + '\'' +
          ", Форм-фактор='" + formFactor + '\'';
    } else {
      return getModel();
    }
  }
}

