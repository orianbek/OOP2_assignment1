package mixinDevices;

public class MechanicalMotor extends MechanicalDevice implements Speed {
    public void operateMechanicalMotor() {
        mechanicalInput();
        controlSpeed();
    }
}
