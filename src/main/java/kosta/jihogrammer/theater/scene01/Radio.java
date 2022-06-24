package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Product;

public class Radio implements Product {

    private boolean powerOn;
    private int volume;

    public Radio() {
        powerOn = false;
        volume = 15;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public int turnVolumeDown() {
        return volume -= 1;
    }

    public int turnVolumeUp() {
        return volume += 1;
    }

    public int getVolume() {
        return volume;
    }
}
