package kosta.jihogrammer.theater.model;

import java.util.Map;

public interface Scene {
    void action(Stage stage, Map<String, Actor> actors, Map<String, Product> products);
}
