package Inheritance.Exercise2;

public class Exercise
{
    static void main()
    {
        Entity a = new Entity("Delboy8080");
        Player b = new Player("BeeGeesFan202", 55);
        Enemy c = new Enemy("Elite Zealot");

        System.out.println(a.describe());
        System.out.println(b.describe());
        System.out.println(c.describe());
    }
}
