package hunters.animals;

public class Bear extends Animal {

    private static final int ENERGY = 20;

    private int age;
    private int weight;
    private int height;

    public Bear(int age, int weight, int height) {
        super(ENERGY);
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // ------

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

}
