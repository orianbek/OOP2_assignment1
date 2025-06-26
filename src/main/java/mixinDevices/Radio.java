package mixinDevices;

public class Radio extends FrequencyDevice implements Audio {
   public void operateRadio(){
       switchOn();
       channelTuning();
       controlVolume();
   }
}
