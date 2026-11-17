package Inheritance.Exercise3;

public class Entity
{
    private String name;

    public Entity(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }
    public String describe()
    {
        return "Entity: " + name;
    }

}
