package creatureTracker.Classes;

public abstract class Plant extends Living implements creatureTracker.interfaces.Plant {
    boolean roots;

    public Plant() {
        super();
        this.roots =true;
    }
    public boolean hasRoots(){
        return this.roots;
    }
    public void setRoots(boolean roots) {
        this.roots = roots;
    }
}
