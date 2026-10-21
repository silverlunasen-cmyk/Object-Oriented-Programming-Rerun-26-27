package Collections1_ArrayList.Exercise5;

import java.util.ArrayList;

public class Exercise
{
    static long timeAppend(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for(int i = 0; i < 50000; i++)
        {
            list.add(i);
        }
        long end = System.nanoTime();
        return end - start;
    }
    static long timeInsertFront(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++)
        {
            list.add(0,i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    static void main()
    {
        ArrayList<Integer> a = new ArrayList<>();
        long appendNanos = timeAppend(50000);
        long frontNanos = timeInsertFront(10000);

        System.out.println("When inserting from the front, it takes: " +frontNanos+" nanoseconds");
        System.out.println("While appending, it takes: " + appendNanos + " nanoseconds");

    }
}
