package Inheritance.Exercise4;

abstract class Weapon
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
