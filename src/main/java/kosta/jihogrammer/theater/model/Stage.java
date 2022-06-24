package kosta.jihogrammer.theater.model;

import java.util.HashMap;
import java.util.Map;

public class Stage {
    protected Map<String, Actor> actors;
    protected Map<String, Product> products;
    public Stage() {
        actors = new HashMap<>();
        products = new HashMap<>();
    }

    public Stage registerActor(Actor actor) {
        actors.put(actor.getName(), actor);
        return this;
    }

    public Stage registerProduct(Product product) {
        products.put(product.getName(), product);
        return this;
    }
}
