package kosta.jihogrammer.electronic;

public class Factory {

    public static void main(String[] args) {

        AirConditioner airConditioner = new SamsungAirConditioner();

        airConditioner.turnOn();
        airConditioner.turnOff();

        airConditioner.turnOn();
        airConditioner.temperatureUp();
        airConditioner.temperatureDown();

        airConditioner.breakIt();
        airConditioner.init();
        airConditioner.fix();

    }

}
