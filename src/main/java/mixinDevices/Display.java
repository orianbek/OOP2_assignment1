package mixinDevices;

public interface Display {
     default void changeResolution(){
        System.out.println("Change resolution");
    }
}
