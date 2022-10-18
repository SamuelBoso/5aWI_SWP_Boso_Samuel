
public class main {
    public static void main(String[] args) {
        //Battery
        Battery battery1 = new Battery(80);
        Battery battery2 = new Battery(70);

        //Remote Control
        RemoteControl r1 = new RemoteControl("HP","grey");

        //set batteries for Remote Control
        r1.setBattery1(battery1);
        r1.setBattery2(battery2);

        System.out.println("Mein aktueller Ladestand ist: " + r1.getStatus(battery2));

        //Debugging turnOn()
        //r1.turnOn();

        //Debugging turnOff()
        r1.turnOff();


    }
}
