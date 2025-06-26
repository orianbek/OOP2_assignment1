package mixinDevices;

public class Fridge extends ElectronicDevice implements Temperature {
    public void operateFridge(){
        switchOn();
        controlTemperature();
    }
}