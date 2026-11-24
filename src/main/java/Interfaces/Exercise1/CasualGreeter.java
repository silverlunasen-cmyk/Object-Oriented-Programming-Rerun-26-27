package Interfaces.Exercise1;

public class CasualGreeter implements Greeter
{
    @Override
    public void greet(String name)
    {
        System.out.println("Hey " + name + "!");
    }
}
