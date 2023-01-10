package at.bos.games.strategypattern;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(int delta);
}
