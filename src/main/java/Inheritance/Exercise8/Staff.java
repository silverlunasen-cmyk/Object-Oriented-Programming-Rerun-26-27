package Inheritance.Exercise8;

public class Staff extends Inheritance.Exercise4.Weapon
{
    public Staff(String id)
    {
        super(id);
    }

    @Override
    public int damage()
    {
        return 53;
    }
}

