package at.bos.games.observerpattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;

public class Player implements Actors{
    private float x, y, speed;
    private List<Observer> observers;



    public Player(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = 1f;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void render(Graphics graphics) {
        graphics.fillRect(this.x,this.y, 50, 50);
    }

    public void update(GameContainer gc, int delta) {
        if(gc.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float)delta * speed;
        }
        else if(gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += delta*speed;
        }
        else if(gc.getInput().isKeyDown(Input.KEY_UP)){
            this.y -= delta*speed;
        }
        else if(gc.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y += delta*speed;
        }
        if(this.x>700 || this.x<0 || this.y>600 || this.y<0){
            for (Observer observer: observers) {
                observer.inform();
            }
        }

    }
}
