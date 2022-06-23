package kosta.jihogrammer.animal;

public class GoldFish extends Animal {

    private int fin;

    public GoldFish(String name) {
        super(name);
    }

    public GoldFish(String name, int fin) {
        super(name);
        this.fin = fin;
    }

    @Override
    public void move() {
        swim();
    }

    private void swim() {
        System.out.println(getName() + " 헤엄치다.");
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

}
