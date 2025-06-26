package mixinDevices;

public class Television extends FrequencyDevice implements Audio,Display {

    public void operateTelevision(){
        switchOn();
        channelTuning();
        changeResolution();
        controlVolume();
    }


}
