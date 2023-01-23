package at.bos.games.DogExample;

import at.bos.games.DogExample.strategies.BarkStrategy;

public class Malteser extends AbstractDog{
    protected BarkStrategy barkStrategy;

    public Malteser(BarkStrategy barkStrategy) {
        this.barkStrategy = barkStrategy;
    }
    @Override
    public void run() {
        System.out.println("I am Malteser");
        barkStrategy.bark();
    }
}
