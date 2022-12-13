package at.bos.games.objects_with_actor;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class EllipseActor {
    private double x,y;
    private int ellipseDirection = 0;

    public EllipseActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){
        if (this.ellipseDirection == 0) {
            this.x++;
            if (this.x >= 600) {
                this.ellipseDirection = 1;
            }
        } else if (this.ellipseDirection == 1) {
            this.x--;
            if (this.x <= 20) {
                this.ellipseDirection = 0;
            }
        }
    }

    public void render(Graphics graphics){
        graphics.drawOval((float)this.x,(float)this.y,90,20);
    }
}
