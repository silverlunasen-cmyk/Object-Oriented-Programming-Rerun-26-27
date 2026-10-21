package Collections1_ArrayList.Exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise
{

    public static void removeEvens(ArrayList<Integer> xs)
    {
        if (xs == null)
            return;

        Iterator<Integer> it = xs.iterator();//Iterator loops through collections, like array lists and hash maps;
        while (it.hasNext())
        {
            Integer value = it.next();
            if (value != null && value % 2 == 0)
            {
                it.remove();
            }
        }
    }

    private static ArrayList<Integer> toList(int[] xs)
    {
        ArrayList<Integer> out = new ArrayList<>();
        if (xs != null)
        {
            for (int i = 0; i < xs.length; i++)
            {
                out.add(xs[i]);
            }
        }
        return out;
    }

    static void main()
    {
        ArrayList<Integer> xs = toList(new int[]{1, 2, 3, 4, 5, 6});

        System.out.println(xs);
        removeEvens(xs);
        System.out.println(xs.toString().equals("[1, 3, 5]"));
        System.out.println(xs);
    }
}