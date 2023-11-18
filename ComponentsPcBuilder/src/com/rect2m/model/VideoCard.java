package com.rect2m.model;

import com.rect2m.logic.Displayable;

public class VideoCard extends Characteristics implements Displayable {
  private int frequency;
  private String memoryType;
  private int memorySize;
  public VideoCard(double price, String brand, String model, int year, int frequency, String memoryType, int memorySize) {
    super(price, brand, model, year);
    this.frequency = frequency;
    this.memoryType = memoryType;
    this.memorySize = memorySize;
  }
  
 
  public int getFrequency() {
    return frequency;
  }
  public String getMemoryType() {
    return memoryType;
  }
  public int getMemorySize() {
    return memorySize;
  }
  public static VideoCard[] VideoCardsCreat() {
    VideoCard[] videoCardsArray = new VideoCard[7];

    videoCardsArray[0] = new VideoCard(549.99, "NVIDIA", "RTX 3080 Ti", 2022, 1700, "GDDR6X", 12);
    videoCardsArray[1] = new VideoCard(799.99, "AMD", "RX 6900 XT", 2022, 2100, "GDDR6X", 16);
    videoCardsArray[2] = new VideoCard(349.99, "NVIDIA", "GTX 1660 Super", 2022, 1500, "GDDR5", 6);
    videoCardsArray[3] = new VideoCard(649.99, "AMD", "RX 6800 XT", 2022, 2000, "GDDR6", 16);
    videoCardsArray[4] = new VideoCard(899.99, "NVIDIA", "RTX 4090", 2022, 2000, "GDDR7", 32);
    videoCardsArray[5] = new VideoCard(279.99, "AMD", "RX 5700 XT", 2022, 1750, "GDDR6", 8);
    videoCardsArray[6] = new VideoCard(399.99, "NVIDIA", "RTX 3060 Ti", 2022, 1750, "GDDR6", 8);

    return videoCardsArray;
  }

  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Відео карта{" + " "+
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Частота=" + frequency +
          ", Тип памяті='" + memoryType + '\'' +
          ", Обсяг памяті=" + memorySize +
          '}';
    } else {
      return  "" + getModel() + '\'';
    }
  }
 
}
