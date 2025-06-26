package creatureTracker.Classes;

public class Sunfish extends Fish {
 private boolean yellow;

    public Sunfish(boolean yellow) {
        super();
        this.yellow = yellow;
    }
    public boolean isYellow(){
        return this.yellow;
    }
}
