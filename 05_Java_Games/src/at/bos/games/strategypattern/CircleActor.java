package at.bos.games.strategypattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor{

    public CircleActor(MoveStrategy moveStrategy1) {
        super(moveStrategy1);
    }

    public void render(Graphics graphics){
        graphics.drawOval(moveStrategy1.getX(), moveStrategy1.getY(), 20, 20);
    }

}
