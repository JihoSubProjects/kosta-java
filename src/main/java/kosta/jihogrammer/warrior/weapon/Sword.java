package kosta.jihogrammer.warrior.weapon;

public class Sword implements Weapon {

    private String name;
    private int power;

    public Sword(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int attack(int baseStrength) {
        return baseStrength + power;
    }

}
