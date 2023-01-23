package at.bos.games.factorypatternanimals;

import at.bos.games.observerpattern.Actors;
import at.bos.games.observerpattern.Player;
import at.bos.games.observerpattern.RectActor;

import java.util.Random;

public class RandomAnimalFactory {
    public static Animals getRandomActor(){
        Random random = new Random();
        int random1 = random.nextInt(3);

        if(random1==0){
            return new Wolf("Hannes");
        }
        if(random1==1){
            return new Biene("Maja");
        }
        return new Ameise("Josef");
    }
}
