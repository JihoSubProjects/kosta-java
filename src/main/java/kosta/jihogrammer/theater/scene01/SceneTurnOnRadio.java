package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Scene;

public class SceneTurnOnRadio implements Scene {

    @Override
    public void action() {

        LivingRoom room = new LivingRoom();
        Child ruby = new Child("Ruby", 3);
        Mom lizzie = new Mom("Lizzie", ruby.getName());
        Radio radio = new Radio();

        room
                .registerActor(lizzie)
                .registerActor(ruby)
                .registerProduct(radio);

        lizzie.listenToRadio(room);

    }

}
