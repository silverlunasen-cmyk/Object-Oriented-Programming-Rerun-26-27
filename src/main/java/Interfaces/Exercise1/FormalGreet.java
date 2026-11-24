package Interfaces.Exercise1;

public class FormalGreet implements Greeter
{
    @Override
    public void greet(String name)
    {
        System.out.println("Good evening, " + name);
    }
}
