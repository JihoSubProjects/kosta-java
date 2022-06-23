package kosta.jihogrammer.electronic.model;

public abstract class Electronic implements Switch {

    private Status status;

    protected Electronic() {
        init();
    }

    public final void init() {
        System.out.println("INITIALIZED");
        setStatus(Status.OFF);
    }

    public void fix() {
        System.out.println(getStatus() == Status.BROKEN ? "FIXED" : "Already Normal");
        init();
    }

    public final void breakIt() {
        System.out.println("BROKEN");
        setStatus(Status.BROKEN);
    }

    @Override
    public final void turnOn() {
        System.out.println("TURN ON");
        setStatus(Status.ON);
    }

    @Override
    public final void turnOff() {
        System.out.println("TURN OFF");
        setStatus(Status.OFF);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}