package kosta.jihogrammer.electronic.remote_controller;

import kosta.jihogrammer.electronic.model.Status;
import kosta.jihogrammer.electronic.model.Switch;
import kosta.jihogrammer.electronic.air_conditioner.AirConditioner;

@Deprecated
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
        if (product.getStatus() != Status.ON) product.temperatureUp();
    }

    public void down() {
        if (product.getStatus() != Status.ON) product.temperatureDown();
    }

}
