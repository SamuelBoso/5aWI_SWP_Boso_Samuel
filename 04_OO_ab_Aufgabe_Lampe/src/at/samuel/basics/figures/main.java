package at.samuel.basics.figures;

import org.w3c.dom.css.Rect;

public class main {
    public static void main(String[] args) {
        //Kreis erstellen
        Circle circle1 = new Circle("Kreis1",4.0);
        Circle circle2 = new Circle("Kreis2",5.0);

        System.out.println(circle1.getName());
        System.out.println(circle1.getArea());
        //System.out.println(circle2.getName());
        //System.out.println(circle2.getArea());

        //Rechteck erstellen
        Rectangle rectangle1 = new Rectangle("Rechteck1",4.0,3.0);
        Rectangle rectangle2 = new Rectangle("Rechteck2",3.0,5.0);

        System.out.println(rectangle1.getName());
        System.out.println(rectangle1.getArea());
        //System.out.println(rectangle2.getName());
        //System.out.println(rectangle2.getArea());

        //Quadrat erstellt
        Cube cube1 = new Cube("Quadrat1",4.0);
        Cube cube2 = new Cube("Quadrat2",3.0);

        System.out.println(cube1.getName());
        System.out.println(cube1.getArea());
        //System.out.println(cube2.getName());
        //System.out.println(cube2.getArea());
    }
}
