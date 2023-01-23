package at.bos.games.SunCollector;

public class Heizung implements Observer{

    @Override
    public void inform() {
        System.out.println("Ich die: Heizung wurde informiert!");
    }
}
