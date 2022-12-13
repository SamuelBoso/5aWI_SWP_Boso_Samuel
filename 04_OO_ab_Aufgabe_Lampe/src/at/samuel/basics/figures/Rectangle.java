package at.samuel.basics.figures;

public class Rectangle extends Figure{
    private Double width;
    private Double height;

    public Rectangle(String name, Double width, Double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return width * height;
    }
}
