package Collections2_LinkedLIst.Exercise1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise
{
    static void main()
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(-2);
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("List before iterator: " + list);
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext())
        {
            int value = it.next();
            if(value <= 0)
            {
               it.remove();
            }
        }

        System.out.println("List after iterator used: " + list);
    }



}
