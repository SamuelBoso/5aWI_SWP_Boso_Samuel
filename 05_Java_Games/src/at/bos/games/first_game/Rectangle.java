package at.bos.games.first_game;

import org.newdawn.slick.*;

public class Rectangle extends BasicGame{
    private float x;
    private float y;
    private float speed;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.speed = 50.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x += (float)delta/this.speed;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawString( "Hello you",50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
