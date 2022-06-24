package kosta.jihogrammer.warrior.helmet;

public class HuntingCap implements Helmet {

    private String name;
    private int defense;

    public HuntingCap(String name, int defense) {
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
