package mixinDevices;

public interface Temperature {
    default  void controlTemperature(){
        System.out.println("Control temperature");
    }
}
