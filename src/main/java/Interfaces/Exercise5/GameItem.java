package Interfaces.Exercise5;

public class GameItem implements Named
{
    String name;

    public GameItem(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
