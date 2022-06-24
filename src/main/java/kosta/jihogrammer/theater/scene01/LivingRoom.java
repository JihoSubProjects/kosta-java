package kosta.jihogrammer.theater.scene01;

import kosta.jihogrammer.theater.model.Stage;

import java.util.Map;

public class LivingRoom implements Stage {

    private Map<String, Child> children;
    private Radio radio;

    public Child callChild(String name) {
        return children.get(name);
    }

    public Radio requestRadio() {
        return radio;
    }

}
