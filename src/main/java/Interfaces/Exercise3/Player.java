package Interfaces.Exercise3;

public class Player implements Moveable, Damageable
{
    private int x = 0;
    private String name;
    private int health = 100;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void move()
    {
        x = x+2;
    }
    @Override
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
        return "Player{" +
                "name='" + name + '\'' +
                "x=" + x + "'\'" +
                ", health=" + health +
                '}';
    }
}
