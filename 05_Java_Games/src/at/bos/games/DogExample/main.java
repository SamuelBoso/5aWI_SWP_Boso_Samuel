package at.bos.games.DogExample;

import at.bos.games.DogExample.strategies.BarkStrategy;
import at.bos.games.DogExample.strategies.Wauu;
import at.bos.games.DogExample.strategies.Wuff;

public class main {
    public static void main(String[] args) {
        Wauu ws1 = new Wauu();
        Wuff wf1 = new Wuff();

        Dachshund dackel1 = new Dachshund(ws1);
        Malteser malteser1 = new Malteser(wf1);

        dackel1.run();
        malteser1.run();
    }
}
