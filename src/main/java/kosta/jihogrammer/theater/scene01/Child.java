package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Actor;

public class Child extends Actor {

    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public boolean canYouTurnOnRadio(Radio radio) {
        return false;
    }

    public void turnOnRadio(Radio radio) {}

    public int turnVolumeRadio(Radio radio) {
        return 0;
    }

}
