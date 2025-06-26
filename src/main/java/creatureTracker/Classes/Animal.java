package creatureTracker.Classes;
public abstract class Animal extends Living implements creatureTracker.interfaces.Animal {
    private boolean move;
    private boolean skin;

    public Animal() {
        super();
        this.move = true;
        this.skin = true;

    }

    public boolean canMove() {
        return this.move;
    }

    public boolean hasSkin() {
        return this.skin;
    }

    public void setCanMove(boolean canMove) {
        this.move = canMove;
    }
    public void setHasSkin(boolean hasSkin) {
        this.skin = hasSkin;
    }
}
