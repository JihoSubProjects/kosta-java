package kosta.jihogrammer.animal;

public class Animal {

    private String name;
    private String color;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(
                new StringBuilder()
                        .append(name)
                        .append(" - ")
                        .append(food)
                        .append(" 먹음")
        );
    }

    public void move() {
        throw new RuntimeException("상속받은 인스턴스에서 호출해야 합니다.");
    }

    public void sleep() {
        System.out.println(name + " 잠들다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
