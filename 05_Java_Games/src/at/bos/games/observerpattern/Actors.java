package at.bos.games.observerpattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actors {
    void render(Graphics graphics);
    void update(GameContainer gc, int delta);
}
