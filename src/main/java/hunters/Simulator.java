package hunters;

import hunters.animals.Animal;
import hunters.animals.Bear;
import hunters.animals.Bunny;
import hunters.guns.ColtPistol;
import hunters.guns.Gun;
import hunters.guns.RemingtonRifle;

public class Simulator {

    public static void main(String[] args) {
        Hunter elmer = new Hunter();

        // --------

        Gun gun = new RemingtonRifle(750, 45);
        Animal yogi = new Bear(10, 1500, 300);

        elmer.shot(yogi, gun);
        System.out.println(yogi.isAlive() ? "Run Yogi!" : "Oh no, poor Yogi");

        // --------

        Gun gun2 = new ColtPistol();
        Animal bugsBunny = new Bunny();

        elmer.shot(bugsBunny, gun2);
        System.out.println(bugsBunny.isAlive() ? "Run Bugs Bunny!" : "Oh no, poor Bugs Bunny");

    }

}
