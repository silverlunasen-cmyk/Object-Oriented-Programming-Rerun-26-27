package Collections2_LinkedLIst.Exercise4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise
{
    static void main()
    {
        LinkedList<String> jobs = new LinkedList<>();

        Deque<String> dq = jobs;

        dq.offer("build");
        dq.offer("test");
        dq.offer("package");
        dq.offer("deploy");

        LinkedList<String> executed = new LinkedList<>();

        while(!dq.isEmpty())
        {
            String job = dq.poll();
            executed.add(job);
            System.out.println("Processing: " + job);

            if("test".equals(job))
            {
                ListIterator<String> it = jobs.listIterator();
                it.add("lint");
            }
        }

        System.out.println("Final Execution Order: " + executed);
    }
}
