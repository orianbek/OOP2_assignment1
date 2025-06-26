package mixinDevices;

import java.util.Scanner;

public class Controller extends ElectronicDevice {
    public void operateController(){
        Radio radio = new Radio();
        Speakers speakers = new Speakers();
        Television television = new Television();
        MechanicalMotor mechanicalMotor = new MechanicalMotor();
        ElectronicMotor electronicMotor = new ElectronicMotor();
        Oven oven = new Oven();
        Fridge fridge = new Fridge();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your option: \n 1.All devices \n 2.Electronic only \n 3.Garage \n 4.Kitchen \n 5.Living room \n 6.Exit");
            switch (scan.nextLine()){
                case "1":
                    System.out.println("Powering all devices");
                    radio.operateRadio();
                    speakers.operateSpeaker();
                    television.operateTelevision();
                    oven.operateOven();
                    fridge.operateFridge();
                    mechanicalMotor.operateMechanicalMotor();
                    electronicMotor.operateElectronicMotor();
                    break;
                case "2":
                    System.out.println("Powering electronic devices only");
                    radio.operateRadio();
                    speakers.operateSpeaker();
                    television.operateTelevision();
                    oven.operateOven();
                    fridge.operateFridge();
                    electronicMotor.operateElectronicMotor();
                    break;
                case "3":
                    System.out.println("Powering Garage");
                    mechanicalMotor.operateMechanicalMotor();
                    break;
                case "4":
                    System.out.println("Kitchen devices only");
                    oven.operateOven();
                    fridge.operateFridge();
                    break;
                case "5":
                    System.out.println("Living rooms only");
                    radio.operateRadio();
                    speakers.operateSpeaker();
                    television.operateTelevision();
                    break;
                case "6":
                    System.out.println("Exiting");
                    System.exit(0);

            }
            System.out.println("---------------------------------------------------------");
        }

    }
}
