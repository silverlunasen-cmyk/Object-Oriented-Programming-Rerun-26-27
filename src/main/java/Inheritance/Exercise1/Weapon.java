package Inheritance.Exercise1;

public class Weapon
{
    private String name;

    public Weapon(String name)
    {
        this.name = name;
    }
    public String name()
    {
        return name;
    }
    public String describe() {
        return "Weapon: " + name;
    }
}
