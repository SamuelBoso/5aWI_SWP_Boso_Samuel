package Bos.example.cars.car_extended;

public class Car {
    private String color;
    private int maxspeed;
    private Double price;
    private Double consumption;
    private Engine CarEngine;
    private Producer CarProducer;
    private int distance = 0;

    public Car(String color, int maxspeed, Double price, Double consumption, Engine carEngine, Producer carProducer) {
        this.color = color;
        this.maxspeed = maxspeed;
        this.price = price;
        this.consumption = consumption;
        CarEngine = carEngine;
        CarProducer = carProducer;
    }

    public Double getPrice() {
        price = this.price * (1-CarProducer.getDiscount());
        return price;
    }

    public void drive(int time){
        for (int i = 0; i < time; i++) {
            distance+= 200;
        }
        if(distance>50000){
            Double newconsumption = this.consumption * 1.098;
            System.out.println("Der Verbrauch erhoeht sich nun von " + this.consumption + " auf " + newconsumption);
            System.out.println("Das Auto hat " + distance + " Kilometer zurueckgelegt!");
        }
        else{
            System.out.println("Der Verbrauch betraegt derzeit " + this.consumption);
            System.out.println("Das Auto hat " + distance + " Kilometer zurueckgelegt!");
        }
    }
}
