package creatureTracker.Classes;

public abstract class Fish extends Animal implements creatureTracker.interfaces.Fish {
    private boolean gills;
    private boolean scales;
    private boolean swim;

    public Fish() {
        super();
        this.gills = true;
        this.scales = true;
        this.swim = true;
    }

    public boolean hasGills(){
        return this.gills;
    }

    public boolean hasScales(){
        return this.scales;
    }
    public boolean canSwim(){
        return this.swim;
    }

    public void setGills(boolean gills) {
        this.gills = gills;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }
}
