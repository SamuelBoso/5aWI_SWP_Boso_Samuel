package at.bos.games.strategypattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor{
    public RectActor(MoveStrategy moveStrategy1) {
        super(moveStrategy1);
    }

    public void render(Graphics graphics){
        graphics.drawRect(moveStrategy1.getX(), moveStrategy1.getY(), 50, 50);
    }
}
