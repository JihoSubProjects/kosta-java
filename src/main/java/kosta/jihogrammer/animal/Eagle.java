package kosta.jihogrammer.animal;

public class Eagle extends Animal {

    private int wing;

    public Eagle(String name) {
        super(name);
    }

    public Eagle(String name, int wing) {
        super(name);
        this.wing = wing;
    }

    @Override
    public void move() {
        fly();
    }

    private void fly() {
        System.out.println(getName() + " 날다.");
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }

}
