package at.bos.games.SunCollector;

public class main {
    public static void main(String[] args) {
        SunCollector sc1 = new SunCollector();

        Laderegler lr1 = new Laderegler();
        Heizung h1 = new Heizung();
        Geschirrspüler gs1 = new Geschirrspüler();

        sc1.addObserver(lr1);
        sc1.addObserver(h1);
        sc1.addObserver(gs1);
        sc1.activate();

    }
}
