package at.bos.games.SunCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SunCollector {
    private List<Observer> observers;
    private int voltage;

    public SunCollector() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void activate(){
        Random rd = new Random();
        if(rd.nextBoolean() == true) {
            for (Observer observer : observers) {
                observer.inform();
            }
        }
    }

}
