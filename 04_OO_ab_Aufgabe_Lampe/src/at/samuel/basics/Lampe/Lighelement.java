package at.samuel.basics.Lampe;

public class Lighelement {
    private String name;
    private String color;
    private Double consumption;
    private Boolean State;

    public Lighelement(String name, String color, Double consumption, Boolean state) {
        this.name = name;
        this.color = color;
        this.consumption = consumption;
        State = state;
    }

    public void turnOn(){
        if(State==false) {
            State=true;
            System.out.println("Glühelement " + this.name + " eingeschaltet!");
            this.consumption = this.consumption+5;
            System.out.println("Neuer Stromverbrauch: " + this.consumption + "\n");
        }else{
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschaltet!");

        }
    }

    public Double getConsumption() {
        return consumption;
    }

    public Boolean getState() {
        return State;
    }

    public void setState(Boolean state) {
        State = state;
    }

    public String getName() {
        return name;
    }
}
