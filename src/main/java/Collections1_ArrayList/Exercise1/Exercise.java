package Collections1_ArrayList.Exercise1;

import java.util.ArrayList;


//Task: Create an ArrayList<String> of names.
// Append three names, insert one at index 0, replace the last, then remove by value.
public class Exercise
{
     static void main()
     {
         ArrayList<String> names = new ArrayList<>();

         names.add("Night");
         names.add("Former Yugoslav Republic of Macedonia");
         names.add("Shing");

         System.out.println(names.get(0));

         System.out.println(names.get(1));

         names.set(1,"North Macedonia");

         System.out.println("Updated: " + names.get(1));

     }

}
