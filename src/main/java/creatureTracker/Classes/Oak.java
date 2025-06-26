package creatureTracker.Classes;

public class Oak extends Tree {
    private boolean leaves;

    public Oak(boolean leaves) {
        super();
        this.leaves = leaves;
    }
    public boolean isLeaves() {
        return this.leaves;
    }
}
