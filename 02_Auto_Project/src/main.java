public class main {
    public static void main(String[] args){
        //Fuel
        Fuel f1 = new Fuel(7,70);
        Fuel f2 = new Fuel(8,89);

        //Rearmirrors
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);

        //Tires
        Tires t1 = new Tires("Pirelli","softs");
        Tires t2 = new Tires("Pirelli","softs");
        Tires t3 = new Tires("Pirelli","softs");
        Tires t4 = new Tires("Pirelli","softs");

        //Engine
        Engine e1 = new Engine(200,f1);
        Engine e2 = new Engine(300,f2);

        //Cars
        Car c1 = new Car("Opel","23434O",e1);
        Car c2 = new Car("Ferrari","F12346", e2);

        //add mirrors

        c1.addMirror(r1);
        c2.addMirror(r2);

        //add tires

        c1.addTires(t1);
        c1.addTires(t2);
        c1.addTires(t3);
        c1.addTires(t4);

        //get Mirrorposition

        System.out.println(c1.getMirrors().get(0).getPosition());
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
