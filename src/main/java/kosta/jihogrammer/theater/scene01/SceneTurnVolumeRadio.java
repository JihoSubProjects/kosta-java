package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Scene;

public class SceneTurnVolumeRadio implements Scene {
    @Override
    public void action() {
        LivingRoom room = new LivingRoom();
        Child Charles = new Child("Charles", 7);
        Mom Tommy = new Mom("Tommy", Charles.getName());
        Radio radio = new Radio();

        room
                .registerActor(Tommy)
                .registerActor(Charles)
                .registerProduct(radio);

        if (Tommy.askRadioPower(room)) {
            Tommy.adjustTurnOnRadio(room);
            Tommy.adjustTurnVolumeUp(room);
            Tommy.adjustTurnOffRadio(room);
        } else {
            Tommy.turnOnRadio(radio);
            Tommy.turnVolumeUpRadio(room);
            Tommy.turnOffRadio(room);
        }
    }

}
