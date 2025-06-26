package mixinDevices;

public class Oven extends ElectronicDevice implements Temperature {
    public void operateOven(){
        switchOn();
       controlTemperature();
    }

}
