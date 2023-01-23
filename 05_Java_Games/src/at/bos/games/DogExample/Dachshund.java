package at.bos.games.DogExample;

import at.bos.games.DogExample.strategies.BarkStrategy;

public class Dachshund extends AbstractDog{
    protected BarkStrategy barkStrategy;

    public Dachshund(BarkStrategy barkStrategy) {
        this.barkStrategy = barkStrategy;
    }

    @Override
    public void run() {
        System.out.println("I am Dachshund");
        barkStrategy.bark();
    }
}
