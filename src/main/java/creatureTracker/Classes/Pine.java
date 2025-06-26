package creatureTracker.Classes;

public class Pine extends Tree {
    private boolean green;

    public Pine(boolean green) {
        super();
        this.green = true;
    }

    public boolean isGreen(){
        return this.green;
    }

}
