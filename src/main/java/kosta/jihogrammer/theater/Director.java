package kosta.jihogrammer.theater;

import kosta.jihogrammer.theater.model.Actor;
import kosta.jihogrammer.theater.model.Product;
import kosta.jihogrammer.theater.model.Scene;
import kosta.jihogrammer.theater.model.Stage;
import kosta.jihogrammer.theater.scene01.LivingRoom;
import kosta.jihogrammer.theater.scene01.Scene01;

import java.util.HashMap;
import java.util.Map;

public class Director {
    public static void main(String[] args) {
        Map<String, Actor> actors = new HashMap<>();
        Map<String, Product> products = new HashMap<>();
        Stage stage = new LivingRoom();

        Scene scene01 = new Scene01();
        scene01.action(stage, actors, products);

    }
}
