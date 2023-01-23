package at.bos.games.singletonpattern;

public class CounterSingleton {
    private static  CounterSingleton instance = null;
    private int Counter = 0;


    private CounterSingleton() {
    }

    public static CounterSingleton getInstance(){
        if(instance==null){
            instance = new CounterSingleton();
            return instance;
        }
        else{
            return instance;
        }
    }

    public void increaseCounter(){
        this.Counter++;
    }

    public int getCounter() {
        return Counter;
    }
}
