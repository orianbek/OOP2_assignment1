package creatureTracker.Classes;

public class Salmon extends Fish {
    private boolean red;

    public Salmon(boolean red) {
        super();
        this.red = red;
    }
    public boolean isRed(){
        return this.red;
    }
}
