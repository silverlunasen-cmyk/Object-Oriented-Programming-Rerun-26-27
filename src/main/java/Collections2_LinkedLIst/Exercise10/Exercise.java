package Collections2_LinkedLIst.Exercise10;

import java.util.Deque;
import java.util.LinkedList;

public class Exercise
{
    private static class Action
    {
        String name;

        Action(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name;
        }
    }
    private static Action next(Deque<Action> high, Deque<Action> mid, Deque<Action> low)
    {
        if (!high.isEmpty()) {
            return high.pollFirst();
        }
        if (!mid.isEmpty()) {
            return mid.pollFirst();
        }
        if (!low.isEmpty()) {
            return low.pollFirst();
        }
        return null;
    }
    static void main()
    {
        Deque<Action> high = new LinkedList<>();
        Deque<Action> mid = new LinkedList<>();
        Deque<Action> low = new LinkedList<>();

        low.addLast(new Action("Sing"));
        mid.addLast(new Action("Dance"));
        high.addLast(new Action("Sing"));
        high.addLast(new Action("Badly do Coreography"));
        low.addLast(new Action("Key Change"));
        mid.addLast(new Action("Obliterate that High note"));

        while(true)
        {
            Action a = next(high, mid, low);
            if(a == null)
            {
                break;
            }

            System.out.println("Executing:" + a);

        }

    }
}
