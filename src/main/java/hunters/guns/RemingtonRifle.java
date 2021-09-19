package hunters.guns;

public class RemingtonRifle extends Gun {

    private static final int POWER = 7;

    private int model;
    private int caliber;

    public RemingtonRifle(int model, int caliber) {
        super(POWER);
        this.model = model;
        this.caliber = caliber;
    }

    // ------

    public int getCaliber() {
        return this.caliber;
    }

    public int getModel() {
        return this.model;
    }

}
