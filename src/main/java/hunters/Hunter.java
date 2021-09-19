package hunters;

import hunters.animals.Animal;
import hunters.guns.Gun;

public final class Hunter {

    public void shot(Animal animal, Gun gun) {
        int power = gun.getPower();
        animal.decrementEnergy(power);
    }
}
