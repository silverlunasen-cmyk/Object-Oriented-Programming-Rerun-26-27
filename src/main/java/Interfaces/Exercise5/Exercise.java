package Interfaces.Exercise5;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Exercise
{
    static void main()
    {
        List<Named> list = new ArrayList<>();

        list.add(new GameItem("Hairbrush"));
        list.add(new GameItem("Water Bottle"));
        list.add(new NPC("Anni-Frid Lyngstad"));
        list.add(new NPC("Tracy Tracy"));

        System.out.println("Sorting by name alphabetically!");
        Collections.sort(list, NamedComparators.byNameAscending());
        for(Named n : list)
        {
            System.out.println(n.getName());
        }

        System.out.println("-------------");

        System.out.println("");
        System.out.println("Sorting by length of name!");

        Collections.sort(list, NamedComparators.byNameLength());
        for(Named n : list)
        {
            System.out.println(n.getName());
        }

    }
}
