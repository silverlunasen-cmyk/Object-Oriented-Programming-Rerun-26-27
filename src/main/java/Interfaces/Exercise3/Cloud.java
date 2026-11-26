package Interfaces.Exercise3;

public class Cloud implements Moveable
{
    private int x;

    @Override
    public void move()
    {
        x += 3;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Cloud at x=" + x;
    }
}

