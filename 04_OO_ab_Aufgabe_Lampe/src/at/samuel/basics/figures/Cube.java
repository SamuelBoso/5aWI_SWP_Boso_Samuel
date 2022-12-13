package at.samuel.basics.figures;

public class Cube extends Figure{
    private Double width;

    public Cube(String name, Double width) {
        super(name);
        this.width = width;
    }

    @Override
    public Double getArea() {
        return width * width;
    }
}
