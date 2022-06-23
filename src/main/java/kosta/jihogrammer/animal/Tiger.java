package kosta.jihogrammer.animal;

public class Tiger extends Animal {

    private int leg;

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, int leg) {
        super(name);
        this.leg = leg;
    }

    @Override
    public void move() {
        run();
    }

    private void run() {
        System.out.println(getName() + " 뛰다.");
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
}
