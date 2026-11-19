package Inheritance.Exercise4;

public abstract class Weapon
{
    private final String id;

    public Weapon(String id)
    {
        this.id = id;
    }

    public abstract int damage();

    public String describe()
    {
        return id + " (Damage: " + damage() + ")";
    }
}
