package com.rect2m.ui;
import com.rect2m.logic.Displayable;
import java.util.Scanner;

public class DetailSelection {
  private String selectedComponent;
  
  
  public String getSelectedComponent() {
    return selectedComponent;
  }
  public static <T> T displayPCDetails(T[] components, boolean fullInfo) {
    
    for (int i = 0; i < components.length; i++) {
      System.out.println("Компонент " + (i + 1) + ":");
      if (components[i] instanceof Displayable) {
        System.out.println(((Displayable) components[i]).toString(fullInfo));
      } else {
        System.out.println(components[i]);
      }
      System.out.println();
    }
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Виберіть номер компонента: ");
    
    int userChoice = scanner.nextInt();
    
    if (userChoice >= 1 && userChoice <= components.length) {
      T selectedComponent = components[userChoice - 1];
      System.out.println("Ви вибрали наступну компоненту:");
      if (selectedComponent instanceof Displayable) {
        System.out.println(((Displayable) selectedComponent).toString(false));
      } else {
        System.out.println(selectedComponent);
      }
      return selectedComponent;
    } else {
      System.out.println("Невірний вибір. Будь ласка, введіть правильний номер.");
      return null;
    }
  }
  
}

