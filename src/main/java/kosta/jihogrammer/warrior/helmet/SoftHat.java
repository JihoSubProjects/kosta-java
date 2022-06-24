package kosta.jihogrammer.warrior.helmet;

public class SoftHat implements Helmet {

    private String name;
    private int defense;

    public SoftHat(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDefense() {
        return defense;
    }
}
