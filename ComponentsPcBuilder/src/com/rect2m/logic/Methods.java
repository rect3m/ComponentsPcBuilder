package com.rect2m.logic;

import com.rect2m.model.AdditionalDrives;
import com.rect2m.ui.DetailSelection;
import java.util.Scanner;

public class Methods {
  public static <T> T selectAndDisplayComponent(T[] components, boolean displayDetails) {
    return DetailSelection.displayPCDetails(components, displayDetails);
  }
  public static AdditionalDrives promptUserForAdditionalDrives() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Оберіть потребу додаткового накопичувача:");
    System.out.println("1. З накопичувачем");
    System.out.println("2. Без накопичувача");
    
    int userChoice = scanner.nextInt();
    if (userChoice == 1) {
      return selectAndDisplayComponent(AdditionalDrives.AdditionalDrivesCreate(), true);
    } else if (userChoice == 2) {
      
      System.out.println("Накопичувач не обраний (без накопичувача).");
      return null ;
    } else {
      System.out.println("Невірний вибір. Оберіть 1 або 2.");

      promptUserForAdditionalDrives();
      return null;
    }
  }
}
