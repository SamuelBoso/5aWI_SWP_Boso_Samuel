package at.bos.games.strategypattern;

import at.bos.games.objects_with_actor.EllipseActor;
import org.newdawn.slick.*;
import org.w3c.dom.css.Rect;

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
        MoveStrategy ms1 = new MoveRight(0,90,0.4f);
        MoveStrategy ms2 = new MoveLeft(500,0,0.3f);

        CircleActor ca1= new CircleActor(ms2);
        RectActor ra1 = new RectActor(ms1);

        this.actors.add(ca1);
        this.actors.add(ra1);

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actors actors : actors){
            actors.update(gc,delta);
        }
    }


    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
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

