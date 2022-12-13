package at.samuel.basics.figures;

public class Circle extends Figure{
    private Double radius;

    public Circle(String name, Double radius) {
        super(name);
        this.radius = radius;

    }
    @Override
    public Double getArea() {
        return radius * radius * Math.PI;
    }
}
