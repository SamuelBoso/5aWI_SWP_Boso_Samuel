package at.bos.games.strategypattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class AbstractActor implements Actors{
    protected MoveStrategy moveStrategy1;

    public AbstractActor(MoveStrategy moveStrategy1) {
        super();
        this.moveStrategy1 = moveStrategy1;
    }

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy1.update(delta);
    }
}
