package creatureTracker.Classes;

public abstract class Flower extends Plant implements creatureTracker.interfaces.Plant {
    private boolean beautiful;
    private boolean leaves;
    private boolean petal;

    public Flower() {
        super();
        this.beautiful = true;
        this.leaves = true;
        this.petal = true;
    }
    public boolean isBeautiful() {
        return this.beautiful;
    }
    public boolean hasLeaves(){
        return this.leaves;
    }
    public boolean hasPetal(){
        return this.petal;
    }

    public void setBeautiful(boolean beautiful) {
        this.beautiful = beautiful;
    }

    public void setLeaves(boolean leaves) {
        this.leaves = leaves;
    }

    public void setPetal(boolean petal) {
        this.petal = petal;
    }
}
