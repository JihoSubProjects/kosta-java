package kosta.jihogrammer.warrior;

import kosta.jihogrammer.warrior.helmet.Helmet;
import kosta.jihogrammer.warrior.helmet.HuntingCap;
import kosta.jihogrammer.warrior.helmet.SoftHat;
import kosta.jihogrammer.warrior.weapon.Sword;
import kosta.jihogrammer.warrior.weapon.Weapon;

public class War {

    public static void main(String[] args) {

        Person shelby = new Person("Tomas");
        Person changretta = new Person("Luca");

        Weapon sword = new Sword("Normal Sword", 10);
        Helmet huntingCap = new HuntingCap("Razor Blade", 10);

        shelby
                .mountWeapon(sword)
                .mountHelmet(huntingCap)
                .attack(
                        changretta.mountHelmet(new SoftHat("Black Hat", 5))
                );

    }

}
