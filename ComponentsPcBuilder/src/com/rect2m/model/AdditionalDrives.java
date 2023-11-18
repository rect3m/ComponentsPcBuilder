package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class AdditionalDrives extends Characteristics implements Displayable {
  private String storageType;
  private int capacityGB;

  public static AdditionalDrives[] AdditionalDrivesCreate() {
    AdditionalDrives[] additionalDrives = new AdditionalDrives[5];

    additionalDrives[0] = new AdditionalDrives(79.99, "Samsung", "970 EVO Plus 500GB", 2020, "M.2 NVMe", 500);
    additionalDrives[1] = new AdditionalDrives(109.99, "WD", "Black SN750 1TB", 2020, "M.2 NVMe", 1000);
    additionalDrives[2] = new AdditionalDrives(59.99, "Crucial", "MX500 250GB", 2018, "2.5 inch SATA", 250);
    additionalDrives[3] = new AdditionalDrives(149.99, "Sabrent", "Rocket Q 2TB", 2021, "M.2 NVMe", 2000);
    additionalDrives[4] = new AdditionalDrives(99.99, "Adata", "XPG SX8200 Pro 1TB", 2019, "M.2 NVMe", 1000);

    return additionalDrives;
  }

  public AdditionalDrives(double price, String brand, String model, int year, String storageType, int capacityGB) {
    super(price, brand, model, year);
    this.storageType = storageType;
    this.capacityGB = capacityGB;
  }

  public String getStorageType() {
    return storageType;
  }

  public int getCapacityGB() {
    return capacityGB;
  }

  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Накопичувач" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Тип накопичувача='" + storageType + '\'' +
          ", Обсяг=" + capacityGB + "GB";
    } else {
      return getModel();
    }
  }
}
