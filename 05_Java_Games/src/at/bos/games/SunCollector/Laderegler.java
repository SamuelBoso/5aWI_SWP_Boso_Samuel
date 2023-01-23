package at.bos.games.SunCollector;

public class Laderegler implements Observer{
    @Override
    public void inform() {
        System.out.println("Ich der: Laderegler wurde informiert!");
    }
}
