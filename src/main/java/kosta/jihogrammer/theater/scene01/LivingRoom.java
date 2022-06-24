package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Actor;
import kosta.jihogrammer.theater.model.Product;
import kosta.jihogrammer.theater.model.Stage;

import java.util.HashMap;
import java.util.Map;

public class LivingRoom extends Stage {

    public LivingRoom() {
        super();
    }

    public Child callChild(String name) {
        return (Child) actors.get(name);
    }

    public Radio requestRadio() {
        return (Radio) products.get("radio");
    }

}
