package Inheritance.Exercise3;

public class Exercise
{
    static void main()
    {
        Entity a = new Entity("Delboy8080");
        Player b = new Player("BeeGeesFan202", 55);
        Enemy c = new Enemy("Elite Zealot");
        BossEnemy d = new BossEnemy("Literally Bon Jovi", 10);

        System.out.println(a.describe());
        System.out.println(b.describe());
        System.out.println(c.describe());
        System.out.println(d.describe());
    }
}

