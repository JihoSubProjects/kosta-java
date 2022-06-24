package kosta.jihogrammer.warrior;

import kosta.jihogrammer.warrior.helmet.Helmet;
import kosta.jihogrammer.warrior.weapon.Weapon;

public class Person {

    private String nickname;
    private int strength;
    private Weapon weapon;
    private Helmet helmet;

    public Person(String nickname) {
        this.nickname = nickname;
        strength = (int) (Math.random() * 10) + 1;
    }

    public Person mountWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Person mountHelmet(Helmet helmet) {
        this.helmet = helmet;
        return this;
    }

    public void attack(Person person) {
        int attackDamage = weapon.attack(strength);
        int defenseValue = person.defense();
        System.out.println(nickname + " " + person.nickname + " 공격 - " + (attackDamage - defenseValue) + " 데미지!");
    }

    public int defense() {
        return helmet.getDefense();
    }

}
