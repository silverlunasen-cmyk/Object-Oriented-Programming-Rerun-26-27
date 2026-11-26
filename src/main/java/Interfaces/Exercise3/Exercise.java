package Interfaces.Exercise3;

import java.util.LinkedList;
import java.util.List;

public class Exercise {


    public static void moveAll(List<Moveable> actors)
    {
        for (Moveable m : actors)
        {
            m.move();
        }
    }

    public static int damageAll(List<Moveable> actors, int amount)
    {
        int hit = 0;
        for (Moveable m : actors)
        {
            if (m instanceof Damageable d)
            {
                d.takeDamage(amount);
                hit++;
            }
        }
        return hit;
    }

    static void main()
    {
        LinkedList<Moveable> actors = new LinkedList<>();
        actors.add(new Player("Hero"));
        actors.add(new Enemy("Slime"));
        actors.add(new Cloud());

        moveAll(actors);
        int hit = damageAll(actors, 10);

        System.out.println("Hit " + hit + " of " + actors.size() + " actors");
        for (Moveable m : actors)
        {
            System.out.println("  " + m);
        }
    }
}