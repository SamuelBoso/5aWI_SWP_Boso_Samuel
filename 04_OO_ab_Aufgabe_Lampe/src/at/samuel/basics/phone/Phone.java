package at.samuel.basics.phone;

import java.util.List;

public class Phone {
    private Sim sim;
    private Camera cam;
    private SDCard card;

    public Phone(Sim sim, Camera cam, SDCard card) {
        this.sim = sim;
        this.cam = cam;
        this.card = card;
    }

    public void takePicture(){
        PhoneFile file = this.cam.takePicture();
        this.card.save(file);
    }

    public void doCall(String number){
        this.sim.doCall(number);
    }

    public int getFreeSpace(){
        return this.card.getFreeSpace();
    }

    public void printAllFiles(){
        List<PhoneFile> files = this.card.getFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
        }
    }
}
