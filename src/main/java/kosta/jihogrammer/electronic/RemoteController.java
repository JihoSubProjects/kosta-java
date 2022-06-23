package kosta.jihogrammer.electronic;

public class RemoteController<T extends AirConditioner> implements Switch {
    T product;

    public RemoteController(T instance) {
        this.product = instance;
    }

    public void turnOn() {
        product.turnOn();
    }

    public void turnOff() {
        product.turnOff();
    }

    public void up() {
        if (product.isPower()) product.up();
    }

    public void down() {
        if (product.isPower()) product.down();
    }

}
