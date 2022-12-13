package at.samuel.basics.phone;

public class main {
    public static void main(String[] args) {
        Sim sim = new Sim(1,"0650123");
        SDCard card = new SDCard(5000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim,cam,card);
        phone.doCall("111123232");

        phone.takePicture();
        phone.takePicture();
        phone.printAllFiles();

        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}
