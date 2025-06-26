package creatureTracker.Classes;

public abstract class Tree extends Plant implements creatureTracker.interfaces.Tree {
    private boolean big;
    private boolean branches;
    private boolean bark;

    public Tree() {
        super();
        this.big = true;
        this.branches = true;
        this.bark = true;
    }

    public boolean isBig() {
        return this.big;
    }
    public void setBig(boolean big) {
        this.big = big;
    }
    public boolean hasBranches() {
        return this.branches;
    }
    public void setBranches(boolean branches) {
        this.branches = branches;
    }
    public boolean hasBark() {
        return this.bark;
    }
    public void setBark(boolean bark) {
        this.bark = bark;
    }
}
