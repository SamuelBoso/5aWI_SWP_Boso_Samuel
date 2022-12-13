package at.bos.games.objects_with_actor;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor {
    private double x,y;
    private int rectDirection = 0;

    public RectActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){
        if (this.rectDirection == 0) {
            this.x++;
            if (this.x >= 700) {
                this.rectDirection = 1;
            }
        } else if (this.rectDirection == 1) {
            this.y++;
            if (this.y >= 500) {
                this.rectDirection = 2;
            }
        } else if (this.rectDirection == 2) {
            this.x--;
            if (this.x <= 100) {
                this.rectDirection = 3;
            }
        } else if (this.rectDirection == 3) {
            this.y--;
            if (this.y <= 100) {
                this.rectDirection = 0;
            }
        }
    }

    public void render(Graphics graphics){
        graphics.drawRect((float)this.x,(float)this.y,50,50);
    }
}
