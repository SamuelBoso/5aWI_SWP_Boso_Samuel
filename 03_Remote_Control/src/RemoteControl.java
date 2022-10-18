public class RemoteControl {
    private Battery battery1;
    private Battery battery2;
    private String producer;
    private String color;

    public RemoteControl(String producer, String color) {
        this.producer = producer;
        this.color = color;
    }

    public void turnOn(){
        int currentbatterystatus1 = battery1.getChargingStatus();
        battery1.setChargingStatus(currentbatterystatus1-5);
        System.out.println("Batterie 1 - Verbraucher angeschlossen. Das ist meine aktueller Ladestand: " + battery1.getChargingStatus());

        int currentbatterystatus2 = battery2.getChargingStatus();
        battery1.setChargingStatus(currentbatterystatus2-5);
        System.out.println("Batterie 2 - Verbraucher angeschlossen. Das ist meine aktueller Ladestand: " + battery2.getChargingStatus());
    }
    public void turnOff(){
        System.out.println("Batterie 1 - kein Verbraucher angeschlossen. Das ist meine aktueller Ladestand: " + battery1.getChargingStatus());
        System.out.println("Batterie 2 - kein Verbraucher angeschlossen. Das ist meine aktueller Ladestand: " + battery2.getChargingStatus());
    }

    public int getStatus(Battery battery){
        return battery.getChargingStatus();
    }

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }
}
