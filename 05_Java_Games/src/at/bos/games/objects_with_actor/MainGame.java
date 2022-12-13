package at.bos.games.objects_with_actor;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {
    private CircleActor ca1;
    private RectActor ra1;
    private EllipseActor ea1;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.ca1 = new CircleActor(20,-20);
        this.ra1 = new RectActor(100,100);
        this.ea1 = new EllipseActor(20,20);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        this.ca1.update(gc,delta);
        this.ra1.update(gc,delta);
        this.ea1.update(gc,delta);
    }


    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.ra1.render(graphics);
        this.ea1.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.bos.games.objects_with_actor.MainGame("MainGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

