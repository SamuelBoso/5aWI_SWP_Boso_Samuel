package at.bos.games.factorypattern;

import at.bos.games.first_game.Rectangle;
import at.bos.games.observerpattern.Actors;
import at.bos.games.observerpattern.Observer;
import at.bos.games.observerpattern.Player;
import at.bos.games.observerpattern.RectActor;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<Actors> actors;
    private List<Actors> observers;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        this.observers = new ArrayList<>();

        this.actors.add(RandomActorFactory.createPlayer());

        for (int i = 0; i < 20; i++) {
            Actors Actor1 = RandomActorFactory.getRandomActor();
            this.observers.add(Actor1);
            this.actors.add(Actor1);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        for(Actors actors : actors){
            actors.update(gameContainer,i);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for(Actors actors : actors){
            actors.render(graphics);
        }
    }

    public static void main(String[] args) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("MainGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
