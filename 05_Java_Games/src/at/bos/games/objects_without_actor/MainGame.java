package at.bos.games.objects_without_actor;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {
    private int rectangleX, rectangleY, circleX, circleY, ellipseX, ellipseY;
    private int rectDirection = 0;
    private int circleDirection = 0;
    private int ellipseDirection = 0;


    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangleX = 100;
        this.rectangleY = 100;
        this.circleX = 20;
        this.circleY = -20;
        this.ellipseX = 20;
        this.ellipseY = 20;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        //Rectangle
        if (this.rectDirection == 0) {
            this.rectangleX++;
            if (this.rectangleX >= 700) {
                this.rectDirection = 1;
            }
        } else if (this.rectDirection == 1) {
            this.rectangleY++;
            if (this.rectangleY >= 500) {
                this.rectDirection = 2;
            }
        } else if (this.rectDirection == 2) {
            this.rectangleX--;
            if (this.rectangleX <= 100) {
                this.rectDirection = 3;
            }
        } else if (this.rectDirection == 3) {
            this.rectangleY--;
            if (this.rectangleY <= 100) {
                this.rectDirection = 0;
            }
        }

        //Circle
        if (this.circleDirection == 0) {
            this.circleY++;
            if (this.circleY >= 500) {
                this.circleDirection = 1;
            }
        } else if (this.circleDirection == 1) {
            this.circleY--;
            if (this.circleY <= 70) {
                this.circleDirection = 0;
            }
        }

        //Ellipse
        if (this.ellipseDirection == 0) {
            this.ellipseX++;
            if (this.ellipseX >= 600) {
                this.ellipseDirection = 1;
            }
        } else if (this.ellipseDirection == 1) {
            this.ellipseX--;
            if (this.ellipseX <= 20) {
                this.ellipseDirection = 0;
            }
        }

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.rectangleX,this.rectangleY,50,50);
        graphics.drawOval(this.circleX,this.circleY,50,50);
        graphics.drawOval(this.ellipseX,this.ellipseY,90,20);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("MainGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
