package creatureTracker.Classes;

public abstract class Bird extends Animal implements creatureTracker.interfaces.Bird {
    private boolean feathers;
    private boolean fly;
    private boolean wings;

    public Bird() {
        super();
        this.feathers = true;
        this.fly = true;
        this.wings = true;
    }
    public boolean hasFeathers(){
        return this.feathers;
    }
    public boolean canFly(){
        return this.fly;
    }
    public boolean hasWings(){
        return this.wings;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }
}
