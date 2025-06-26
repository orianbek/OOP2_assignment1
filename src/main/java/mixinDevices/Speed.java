package mixinDevices;

public interface Speed {
    default  void controlSpeed(){
        System.out.println("controlSpeed");
    }
}
