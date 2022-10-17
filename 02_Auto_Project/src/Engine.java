public class Engine {
    private int horsepower;
    private Fuel fuel;

    public Engine(int horsepower,Fuel fuel) {
        this.horsepower = horsepower;
        this.fuel = fuel;
    }
    public void startMotor(){
        fuel.getRemainingRange();
    }
    public void drive(){
        fuel.drive();
    }
    public void getRemainingRange(){
        fuel.getRemainingRange();
    }
    public void turboBoost(){
        fuel.turboBoost();
    }

    public int getHorsepower() {
        return horsepower;
    }
}
