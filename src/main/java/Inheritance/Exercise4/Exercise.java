package Inheritance.Exercise4;
import java.util.ArrayList;

public class Exercise
{
    static void main()
    {
        ArrayList<Weapon> weapons = new ArrayList<>();

        weapons.add(new Staff("The wand"));
        weapons.add(new Sword("Terra Blade"));

        for (int i = 0; i < weapons.size(); i++)
        {
            System.out.println(weapons.get(i).describe());

        }
    }
}
