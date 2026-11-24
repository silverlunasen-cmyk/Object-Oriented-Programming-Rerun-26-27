package Interfaces.Exercise1;

public class Exercise
{
    static void main()
    {
        Greeter greeter = new CasualGreeter();
        greeter.greet("Klara Hammarstrom");

        Greeter greeter2 = new FormalGreet();
        greeter2.greet("Stan Bush");
    }
}
