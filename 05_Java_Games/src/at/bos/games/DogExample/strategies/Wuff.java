package at.bos.games.DogExample.strategies;

public class Wuff implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("Wufff");
    }
}
