public class main {
    public static void main(String[] args){
        //Fuel
        Fuel f1 = new Fuel(7,70);
        Fuel f2 = new Fuel(8,89);

        //Engine
        Engine e1 = new Engine(200,f1);
        Engine e2 = new Engine(300,f2);

        //Cars
        Car c1 = new Car("Opel","23434O",e1);
        Car c2 = new Car("Ferrari","F12346", e2);

        //Debugging Breaking
        c1.breaking();

        //Debugging Turboboost
        c2.turboBoost();

        //Debugging honking
        c2.honk(2);

        //Debugging remainingRange
        c1.getRemainingRange();

        //Debugging getInfo
        c1.getInfo();
    }
}
