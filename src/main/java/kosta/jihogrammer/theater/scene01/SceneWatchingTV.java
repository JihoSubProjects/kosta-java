package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Scene;

public class SceneWatchingTV implements Scene {
    @Override
    public void action() {
        LivingRoom room = new LivingRoom();
        Child 아들 = new Child("아들", 20);
        Mom 어머니 = new Mom("어머니", 아들.getName());
        Television tv = new Television("Samsung UHD Smart TV");

        room.registerActor(아들).registerActor(어머니).registerProduct(tv);

        어머니.askRadioPower(room);
    }
}
