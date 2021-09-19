package hunters.animals;

public abstract class Animal {

    protected static final int MAX_ENERGY = 1000;

    private int energy;

    protected Animal(int energy) {
        if (energy > MAX_ENERGY) {
            energy = MAX_ENERGY;
        }
        this.energy = energy;
    }

    public final boolean isAlive() {
        return this.energy > 0;
    }

    public final void decrementEnergy(int power) {
        this.energy -= power;
    }

}
