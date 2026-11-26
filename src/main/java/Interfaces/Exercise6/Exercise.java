package Interfaces.Exercise6;

import java.util.LinkedList;

public class Exercise
{
    static void main()
    {
        LinkedList<Command> history = new LinkedList<>();

        history.add(new PrintCommand("Hello World!"));
        history.add(new AddCommand(2,3));
        history.add(new PrintCommand("Done."));

        for(Command command : history)
        {
            command.execute();
        }
    }
}
