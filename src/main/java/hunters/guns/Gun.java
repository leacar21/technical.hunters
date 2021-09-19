package hunters.guns;

public abstract class Gun {

    protected static final int MAX_POWER = 999;

    private int power;

    // Defino contructor sin argumentos como privado para exigir que siempre
    // que se cree un Gun, se especificando un valor de power
    private Gun() {}

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
