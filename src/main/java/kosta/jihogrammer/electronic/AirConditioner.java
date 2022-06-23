package kosta.jihogrammer.electronic;

public class AirConditioner extends Electronic {

    private String brand;
    private int verticalDegree;

    public AirConditioner(String brand) {
        setBrand(brand);
    }

    public void up() {
        setVerticalDegree(getVerticalDegree() + 10);
        System.out.println(getBrand() + " " + getVerticalDegree());
    }

    public void down() {
        setVerticalDegree(getVerticalDegree() - 10);
        System.out.println(getBrand() + " " + getVerticalDegree());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVerticalDegree() {
        return verticalDegree;
    }

    public void setVerticalDegree(int verticalDegree) {
        this.verticalDegree = verticalDegree;
    }
}
