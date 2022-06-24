package kosta.jihogrammer.theater.model;

public class Product implements PowerAdaptor {
    private String name;
    private boolean power;

    public Product(String name) {
        power = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isPowerOn() {
        return power;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " POWER ON");
        power = true;
    }

    @Override
    public void turnOff() {
        System.out.println(name + " POWER OFF");
        power = false;
    }

}
