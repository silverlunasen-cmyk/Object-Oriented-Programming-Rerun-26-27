package Collections2_LinkedLIst.Exercise6;

import java.util.*;

public class Exercise
{
    static void main()
    {
        LinkedList<InputEvent> events = new LinkedList<>();
        events.add(new InputEvent("Walk"));
        events.add(new InputEvent("Attack"));
        events.add(new InputEvent("Heal"));

        ListIterator<InputEvent> it = events.listIterator();
        while(it.hasNext())
        {
            InputEvent e = it.next();
            if("Attack".equals(e.type))
            {
                it.add(new InputEvent("Camera Shake"));
            }
            if("Heal".equals(e.type))
            {
                it.remove();
            }
        }
        for(InputEvent e: events)
        {
            System.out.println("Event type: " + e.type);
        }

    }
}
