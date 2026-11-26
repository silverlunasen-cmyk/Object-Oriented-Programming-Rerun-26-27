package Interfaces.Exercise3;

public class Enemy implements Moveable, Damageable
{
    private final String name;
    private int x;
    private int health = 30;

    public Enemy(String name)
    {
        this.name = name;
    }
    @Override
    public void move()
    {
        x = x+1;
    }
    public void takeDamage(int amount)
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException("You can't have a negative amount of damage!");
        }
        health = Math.max(0, health - amount);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", health=" + health +
                '}';
    }
}



