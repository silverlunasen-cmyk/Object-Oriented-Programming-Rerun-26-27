package Interfaces.Exercise6;

public class PrintCommand implements Command
{
    String message;

    public PrintCommand(String message)
    {
        this.message = message;
    }

    @Override
    public void execute()
    {
        System.out.println(message);
    }
}
