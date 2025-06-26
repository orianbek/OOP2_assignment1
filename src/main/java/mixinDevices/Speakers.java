package mixinDevices;

public class Speakers extends ElectronicDevice implements Audio {
   public void operateSpeaker(){
       switchOn();
       controlVolume();
   }

}
