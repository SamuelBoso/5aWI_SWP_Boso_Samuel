package at.bos.games.observerpattern;

import at.bos.games.strategypattern.*;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<Actors> actors;

    public MainGame(String title) {
        super(title);

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Player pa1 = new Player(250,250,1f);
        RectActor ra1 = new RectActor(40,40);
        RectActor ra2 = new RectActor(400,300);
        this.actors.add(pa1);
        this.actors.add(ra1);
        this.actors.add(ra2);

        pa1.addObserver(ra1);
        pa1.addObserver(ra2);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actors actors : actors){
            actors.update(gc,delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for(Actors actors : actors){
            actors.render(graphics);
        }
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("MainGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
