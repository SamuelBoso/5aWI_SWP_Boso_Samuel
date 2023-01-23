package at.bos.games.SunCollector;

public class Geschirrspüler implements Observer{
    @Override
    public void inform() {
        System.out.println("Ich der: Geschirrspüler wurde informiert!");
    }
}
