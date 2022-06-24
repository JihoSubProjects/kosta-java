package kosta.jihogrammer.theater.model;

public class Actor {

    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public void say(String script) {
        System.out.println(name + ": " + script);
    }

    public String getName() {
        return name;
    }

}
