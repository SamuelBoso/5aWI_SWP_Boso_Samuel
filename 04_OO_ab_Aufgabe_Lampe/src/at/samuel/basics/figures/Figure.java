package at.samuel.basics.figures;

public class Figure {
    Double area;
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }
}
