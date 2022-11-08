package Bos.example.cars.car_extended;

public class Engine {
    public enum TYPE {diesel, gas};
    private TYPE type;
    private int power;

    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;
    }
}