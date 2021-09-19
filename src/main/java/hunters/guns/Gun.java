package hunters.guns;

public abstract class Gun {

    protected static final int MAX_POWER = 999;

    private int power;

    protected Gun(int power) {
        if (power > MAX_POWER) {
            power = MAX_POWER;
        }

        this.power = power;
    }

    public final int getPower() {
        return this.power;
    }

}
