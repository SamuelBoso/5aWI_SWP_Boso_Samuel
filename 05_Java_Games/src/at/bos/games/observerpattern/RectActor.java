package at.bos.games.observerpattern;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actors, Observer{
    private float x,y;
    private Color color = Color.red;

    public RectActor(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillRect(this.x,this.y, 50, 50);
        graphics.setColor(Color.white);
    }

    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void inform() {
        this.color = Color.blue;
    }
}
