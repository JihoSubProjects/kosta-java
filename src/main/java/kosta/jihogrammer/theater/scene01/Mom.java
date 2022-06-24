package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Actor;

public class Mom extends Actor {

    private String childName;

    public Mom(String name, String childName) {
        super(name);
        this.childName = childName;
    }

    // 1. 아이가 라디오를 켤 수 있는지 물어보는 장면
    public boolean askRadioPower(LivingRoom room) {
        say("My sweet, can you turn on the radio?");
        return room
                .callChild(childName)
                .canYouTurnOnRadio(room.requestRadio());
    }

    // 2.1. 아이에게 라디오를 켜달라고 요청하는 장면
    public void adjustTurnOnRadio(LivingRoom room) {
        room.callChild(childName).turnOnRadio(room.requestRadio());
    }

    // 2.2. 아이에게 라디오를 꺼달라고 요청하는 장면
    public void adjustTurnOffRadio(LivingRoom room) {
        room.callChild(childName).turnOffRadio(room.requestRadio());
    }

    // 3. 아이에게 라디오 볼륨 조정을 부탁하는 장면
    public void adjustTurnVolumeUp(LivingRoom room) {
        room.callChild(childName).turnVolumeUpRadio(room.requestRadio());
    }
    public void adjustTurnVolumeDown(LivingRoom room) {
        room.callChild(childName).turnVolumeDownRadio(room.requestRadio());
    }

    // 4. 라디오 볼륨을 확인하는 장면
    public boolean feelAsLowVolume(LivingRoom room) {
        return room.requestRadio().getVolume() < 5;
    }

    public boolean isComfortableVolume(LivingRoom room) {
        int volume = room.requestRadio().getVolume();
        return 20 <= volume && volume <= 30;
    }

    // 5. 라디오의 전원을 크거나 끄는 장면
    public void turnOnRadio(Radio radio) {
        radio.turnOn();
    }
    public void turnOffRadio(LivingRoom room) {
        room.requestRadio().turnOff();
    }

    // 6. 라디오 볼륨 조절하는 장면
    public void turnVolumeUpRadio(LivingRoom room) {
        room.requestRadio().turnVolumeUp();
    }

    public void turnVolumeDownRadio(LivingRoom room) {
        room.requestRadio().turnVolumeDown();
    }

    // 7. From Director Sign
    public void listenToRadio(LivingRoom room) {
        Radio radio = room.requestRadio();

        if (room.requestRadio().isPowerOn()) {

        } else {
            if (askRadioPower(room)) {
                adjustTurnOnRadio(room);
            } else {
                turnOnRadio(radio);
            }
        }
    }

}
