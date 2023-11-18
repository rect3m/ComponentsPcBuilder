import com.rect2m.logic.Methods;
import com.rect2m.model.AdditionalDrives;
import com.rect2m.model.Cooling;
import com.rect2m.model.HardDrive;
import com.rect2m.model.Motherboard;
import com.rect2m.model.PC;
import com.rect2m.model.PSU;
import com.rect2m.model.Processor;
import com.rect2m.model.RAM;
import com.rect2m.model.VideoCard;

public class Main {
  
  public static void main(String[] args) {
    Motherboard selectedMotherboard = Methods.selectAndDisplayComponent(Motherboard.MotherboardsCreat(), true);
    Processor selectedProcessor = Methods.selectAndDisplayComponent(Processor.ProcessorsCreat(), true);
    VideoCard selectedVideoCard = Methods.selectAndDisplayComponent(VideoCard.VideoCardsCreat(), true);
    HardDrive selectedHardDrive = Methods.selectAndDisplayComponent(HardDrive.HardDrivesCreat(), true);
    RAM selectedRam = Methods.selectAndDisplayComponent(RAM.RAMsCreat(), true);
    Cooling selectedCooling = Methods.selectAndDisplayComponent(Cooling.CoolingsCreat(), true);
    PSU selectedPSU = Methods.selectAndDisplayComponent(PSU.PSUsCreat(), true);
    AdditionalDrives selectedAdditionalDrives=Methods.promptUserForAdditionalDrives();
  
    PC pc = new PC.Builder()
      .motherboard(selectedMotherboard.getModel())
      .processor(selectedProcessor.getModel())
      .videoCard(selectedVideoCard.getModel())
      .PSU(selectedPSU.getModel())
      .hardDrive(selectedHardDrive.getModel())
      .RAM(selectedRam.getModel())
      .cooling(selectedCooling.getModel())
      .additionalDrives(selectedAdditionalDrives != null ? selectedAdditionalDrives.getModel() : "немає")
      .build();
    
    System.out.print("Відеокарта: " + pc.getVideoCard() + "\n" +
        "Процесор: " + pc.getProcessor() + "\n" +
        "Материнська плата: " + pc.getMotherboard() + "\n" +
        "Блок живлення: " + pc.getPSU() + "\n" +
        "Диск: " + pc.getHardDrive() + "\n" +
        "Оперативна память: " + pc.getRAM() + "\n" +
        "Система охолодження: " + pc.getCooling()+"\n"+
        "Додатковий накопичувач:"+pc.getAdditionalDrives());
  }
 
}