package kosta.jihogrammer.electronic.air_conditioner;

import kosta.jihogrammer.electronic.model.Electronic;
import kosta.jihogrammer.electronic.remote_controller.RemoteControllerAdaptor;
import kosta.jihogrammer.electronic.model.Status;

public class AirConditioner extends Electronic implements RemoteControllerAdaptor {

    private String brand;
    private int temperature;

    public AirConditioner(String brand) {
        setBrand(brand);
        setTemperature(20);
    }

    @Override
    public void temperatureUp() {
        if (super.getStatus() != Status.ON) throw new RuntimeException("PLEASE TURN ON");
        setTemperature(getTemperature() + 1);
        System.out.println(getBrand() + " " + getTemperature());
    }

    @Override
    public void temperatureDown() {
        if (super.getStatus() != Status.ON) throw new RuntimeException("PLEASE TURN ON");
        setTemperature(getTemperature() - 1);
        System.out.println(getBrand() + " " + getTemperature());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature < 18 ? 18 : Math.min(temperature, 25);
    }

}
