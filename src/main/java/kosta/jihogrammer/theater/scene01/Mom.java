package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Actor;
import kosta.jihogrammer.theater.model.Product;
import kosta.jihogrammer.theater.model.VolumeAdaptor;

public class Mom extends Actor {

    private String childName;

    public Mom(String name, String childName) {
        super(name);
        this.childName = childName;
    }

    public boolean askRadioPower(LivingRoom room) {
        say("My sweet, can you turn on the radio?");
        return room
                .callChild(childName)
                .canYouTurnOnRadio(room.requestRadio());
    }

    public void adjustTurnOnRadio(LivingRoom room) {
        room.callChild(childName).turnOnRadio(room.requestRadio());
    }

    public void adjustTurnOffRadio(LivingRoom room) {
        room.callChild(childName).turnOffRadio(room.requestRadio());
    }

    public void adjustTurnVolumeUp(LivingRoom room) {
        room.callChild(childName).turnVolumeUpRadio(room.requestRadio());
    }
    public void adjustTurnVolumeDown(LivingRoom room) {
        room.callChild(childName).turnVolumeDownRadio(room.requestRadio());
    }

    public boolean feelAsLowVolume(LivingRoom room) {
        return room.requestRadio().getVolume() < 5;
    }

    public boolean isComfortableVolume(LivingRoom room) {
        int volume = room.requestRadio().getVolume();
        return 20 <= volume && volume <= 30;
    }

    public void turnOn(Product product) {
        product.turnOn();
    }
    public void turnOff(Product product) {
        product.turnOff();
    }
    public void volumeUp(VolumeAdaptor product) {
        product.volumeUp();
    }
    public void volumeDown(VolumeAdaptor product) {
        product.volumeDown();
    }

    public void listenToRadio(LivingRoom room) {
        Radio radio = room.requestRadio();

        if (room.requestRadio().isPowerOn()) {

        } else {
            if (askRadioPower(room)) {
                adjustTurnOnRadio(room);
            } else {
                turnOn(radio);
            }
        }
    }

}
