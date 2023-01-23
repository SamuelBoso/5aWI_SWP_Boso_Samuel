package at.bos.games.factorypattern;

import at.bos.games.observerpattern.Actors;
import at.bos.games.observerpattern.Player;
import at.bos.games.observerpattern.RectActor;

import java.util.Random;

public class RandomActorFactory {
    public static Actors createPlayer(){
        Random random = new Random();
        return new Player(random.nextInt(600),random.nextInt(400),1f);
    }

    public static Actors getRandomActor(){
        Random random = new Random();
        boolean bool = random.nextBoolean();

        if(bool){

            return new RectActor(random.nextInt(200),random.nextInt(100));
        }
        if(!bool){
            return new RectActor(random.nextInt(600),random.nextInt(400));
        }
        return new RectActor(random.nextInt(600),random.nextInt(400));
    }
}
