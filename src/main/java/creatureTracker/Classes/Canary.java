package creatureTracker.Classes;

public class Canary extends Bird {
 private boolean yellow;
 private boolean sing;

    public Canary(boolean yellow, boolean sing) {
        super();
        this.yellow = yellow;
        this.sing = sing;
    }

    public boolean isYellow(){
        return this.yellow;
    }
    public boolean canSing(){
        return this.sing;
    }
}
