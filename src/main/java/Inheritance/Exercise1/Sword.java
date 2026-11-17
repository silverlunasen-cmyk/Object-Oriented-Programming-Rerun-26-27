package Inheritance.Exercise1;

public class Sword extends Weapon
{
    private int damage;

    public Sword(String name, int damage)
    {
        super(name);
        this.damage = damage;
    }

    public int damage()
    {
        return damage;
    }

    @Override
    public String describe()
    {
        return "Weapon: " + name() + " (damage it does: " + damage() + ")";
    }
}
