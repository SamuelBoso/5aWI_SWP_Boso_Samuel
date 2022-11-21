package Bos.example.cars.car_extended;

public class main {
    public static void main(String[] args){

        //Ferrari Engine
        Engine e1 = new Engine(Engine.TYPE.gas,960);

        //Producer
        Producer p1 = new Producer("Ferrari","Italy",0.02);
        Producer p2 = new Producer("AlfaRomeo","Italy",0.008);


        Car LaFerrari1 = new Car("red",360,3800000.00,8.00,e1,p1);
        Car LaFerrari2 = new Car("red",360,3700000.00,8.00,e1,p2);


        System.out.println("Der aktuelle mit rabattabzuegliche Preis betraegt " + LaFerrari1.getPrice());

        LaFerrari1.drive(30); //Zeitangabe wie viel Stunden man fahrt PS: in einer Stunde legt man mit diesem Auto knapp 200 km zurück


    }
}


