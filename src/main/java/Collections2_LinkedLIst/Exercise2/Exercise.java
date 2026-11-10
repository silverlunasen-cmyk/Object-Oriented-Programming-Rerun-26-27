package Collections2_LinkedLIst.Exercise2;

import java.util.LinkedList;

public class Exercise
{
    static void main()
    {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('a');
        list.add('a');
        list.add('b');
        list.add('b');
        list.add('b');
        list.add('c');
        list.add('c');
        list.add('c');

        var it = list.listIterator();
        char prev = 0;
        while(it.hasNext())
        {
            char cur = it.next();
            if(prev != 0 && cur != prev)
            {
                it.previous();
                it.add('|');
                it.next();
            }
            prev = cur;
        }
        System.out.println(list);

    }


}
