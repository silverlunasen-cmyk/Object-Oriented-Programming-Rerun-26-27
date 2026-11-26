package Interfaces.Exercise5;

public class NPC implements Named
{
    String name;

    public NPC(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return name;
    }

}
