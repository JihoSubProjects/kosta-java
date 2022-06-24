package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Product;

public class Radio extends Product {

    private boolean powerOn;
    private int volume;

    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    public Radio() {
        super("radio");
        powerOn = false;
        volume = (int) (Math.random() * 10) + 1;
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
        return volume = Math.max(MIN_VOLUME, volume - 1);
    }

    public int turnVolumeUp() {
        return volume = Math.min(MAX_VOLUME, volume + 1);
    }

    public int getVolume() {
        return volume;
    }
}
