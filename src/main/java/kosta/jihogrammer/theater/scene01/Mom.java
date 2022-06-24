package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Actor;
import kosta.jihogrammer.theater.model.Stage;

public class Mom extends Actor {

    public Mom(String name) {
        super(name);
    }

    // 1. 아이가 라디오를 켤 수 있는지 물어보는 장면
    public boolean adjustRadioVolume(LivingRoom room) {
        return room
                .callChild("Ruby")
                .canYouTurnOnRadio(room.requestRadio());
    }

    // 2. 아이에게 라디오를 켜달라고 요청하는 장면
    public void askTurnOnRadio(LivingRoom room) {
        room.callChild("Ruby").turnOnRadio(room.requestRadio());
    }

    // 3. 아이에게 라디오 볼륨 조정을 부탁하는 장면
    public void askTurnVolumeRadio(LivingRoom room) {
        room.callChild("Ruby").turnVolumeRadio(room.requestRadio());
    }

    // 4. 라디오 볼륨을 확인하는 장면
    public boolean isComfortableVolume(LivingRoom room) {
        int volume = room.requestRadio().getVolume();
        return 20 <= volume && volume <= 30;
    }

    // 5. 라디오의 전원을 크거나 끄는 장면
    public void turnRadioPower(LivingRoom room) {
        Radio radio = room.requestRadio();
        if (radio.isPowerOn()) {
            radio.turnOff();
        } else {
            radio.turnOn();
        }
    }

    // 6. 라디오 볼륨 조절하는 장면
    public void turnRadioVolume(LivingRoom room) {
        Radio radio = room.requestRadio();
        int volume = radio.getVolume();

        if (volume > 30) {
            while (radio.getVolume() > 30) {
                radio.turnVolumeDown();
            }
        } else if (volume < 20) {
            while (radio.getVolume() < 20) {
                radio.turnVolumeUp();
            }
        }
    }

    public void feelAsLowVolume() {}

    // 7. From Director Sign
    public void listenToRadio(LivingRoom room) {
        boolean isComfortable = isComfortableVolume(room);
    }

}
