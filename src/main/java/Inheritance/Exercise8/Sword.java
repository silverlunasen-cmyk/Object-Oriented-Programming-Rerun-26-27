package Inheritance.Exercise8;

public class Sword extends Inheritance.Exercise4.Weapon
{
    public Sword(String id)
    {
        super(id);
    }

    @Override
    public int damage()
    {
        return 15;
    }
}

