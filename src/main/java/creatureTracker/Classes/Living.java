package creatureTracker.Classes;

public abstract class Living implements creatureTracker.interfaces.Living {
    private boolean alive;
    private boolean grow;

    public Living() {
        this.alive = true;
        this.grow = true;
    }

    public boolean isAlive(){
        return this.alive;
    }

    public boolean canGrow(){
        return this.grow;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setGrow(boolean grow) {
        this.grow = grow;
    }
}
