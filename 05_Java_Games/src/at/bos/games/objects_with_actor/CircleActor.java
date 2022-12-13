package at.bos.games.objects_with_actor;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor {
    private double x,y;
    private int circleDirection = 0;

    public CircleActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){
        if (this.circleDirection == 0) {
            this.y++;
            if (this.y >= 500) {
                this.circleDirection = 1;
            }
        } else if (this.circleDirection == 1) {
            this.y--;
            if (this.y <= 70) {
                this.circleDirection = 0;
            }
        }
    }

    public void render(Graphics graphics){
        graphics.drawOval((float)this.x,(float)this.y,50,50);
    }

}
