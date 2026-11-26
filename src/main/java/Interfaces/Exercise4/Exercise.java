package Interfaces.Exercise4;

import java.util.Random;
import java.util.List;

public class Exercise
{
    public static AttackStrategy pickRandom(List<AttackStrategy> options, Random random)
    {
        if (options == null || options.isEmpty())
        {
            throw new IllegalArgumentException("options must not be empty");
        }
        return options.get(random.nextInt(options.size()));
    }

    static void main()
    {

        enemy.setStrategy(pickRandom());

        List<AttackStrategy> options = List.of(new MeleeAttack(), new RangedAttack());
        Random random = new Random(42);
        for (int turn = 1; turn <= 3; turn++) {
            enemy.setStrategy(pickRandom(options, random));
            System.out.println("Turn " + turn + ": " + enemy.performAttack("Player"));
        }


    }

}
