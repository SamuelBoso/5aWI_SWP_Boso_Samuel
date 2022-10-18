import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanz / Gedächtnisvariable
    private String brand;
    private String serialNumber;
    private Engine engine;
    private String color;
    private String manufacturer;
    private int amountofrepitions;

    private List<RearMirror> mirrors;
    private List<Tires> tires;

    public Car(String brand, String serialNumber,Engine engine)
    {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.mirrors = new ArrayList<>();
    }
    public void getInfo(){
        System.out.println("Dieses Auto wurde von " + this.brand + "gebaut und besitzt insgesamt" + engine.getHorsepower() + " PS");
    }
    public void startMotor(){
        engine.startMotor();
    }
    public void drive(){
        engine.drive();
    }
    public void breaking(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        engine.turboBoost();
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("honk");
        }
    }
    public void getRemainingRange(){
        engine.getRemainingRange();
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Tires> getTires() {
        return tires;
    }

    public void addTires(Tires tires){
        this.tires.add(tires);
    }
}
