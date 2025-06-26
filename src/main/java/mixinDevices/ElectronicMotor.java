package mixinDevices;

public class ElectronicMotor extends ElectronicDevice implements Speed {
    public void operateElectronicMotor(){
        switchOn();
        controlSpeed();
    }
}
