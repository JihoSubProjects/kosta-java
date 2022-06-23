package kosta.jihogrammer.electronic;

/**
 * TODO
 * - 전자제품 on/off 기능
 * -
 */
public abstract class Electronic implements Switch {

    private boolean power;
    private boolean state;

    Electronic() {
        init();
    }

    public final void init() {
        System.out.println("INITIALIZED");
        setPower(false);
        setState(true);
    }

    public void fix() {
        System.out.println("FIXED");
        setState(true);
    }

    public final void breakIt() {
        System.out.println("BROKEN");
        setPower(false);
        setState(false);
    }

    @Override
    public final void turnOn() {
        System.out.println("TURN ON");
        setPower(true);
    }

    @Override
    public final void turnOff() {
        System.out.println("TURN OFF");
        setPower(false);
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}