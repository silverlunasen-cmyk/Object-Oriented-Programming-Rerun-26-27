package Interfaces.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise
{
    static void main()
    {
        List<Interactable> objects = new ArrayList<>();
        objects.add(new Door("Wooden door"));
        objects.add(new Chest("Treasure chest"));
        objects.add(new NPC("Shopkeeper"));

        for (int i = 0; i < objects.size(); i++)
        {

            System.out.println(objects.get(i).interact());

        }
    }

}
