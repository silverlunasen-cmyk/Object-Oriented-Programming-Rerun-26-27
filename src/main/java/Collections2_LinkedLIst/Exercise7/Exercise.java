package Collections2_LinkedLIst.Exercise7;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise
{
    static int game(int n, int k)
    {
        LinkedList<Integer> players = new LinkedList<>();
        for(int i = 0; i <= n; i++)
        {
            players.add(i);
        }
        ListIterator<Integer> it = players.listIterator();

        int step = 0;

        while(players.size() > 1)
        {
            if(!it.hasNext())
            {
                it = players.listIterator();
            }
            it.next();
            step++;

            if(step == k)
            {
                it.remove();
                step = 0;
            }

        }
        return players.getFirst();
    }
    static void main()
    {
        int test = game(7,6);
        System.out.println("Test:" + test);
    }

}
