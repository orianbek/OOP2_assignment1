package mixinDevices;

public interface Audio {
      default void controlVolume(){
        System.out.println("controlVolume");
    }
}
