package Inheritance.Exercise3;

public class Enemy extends Entity
{
    public Enemy(String name)
    {
        super(name);
    }

    @Override
    public String describe()
    {
        return "Enemy: " + name();
    }
}
