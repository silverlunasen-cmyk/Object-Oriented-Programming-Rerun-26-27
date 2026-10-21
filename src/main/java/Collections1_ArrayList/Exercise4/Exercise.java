package Collections1_ArrayList.Exercise4;

import java.util.ArrayList;

public class Exercise
{
    static ArrayList<String> uniqueOrderPreserving(ArrayList<String> input)
    {
        ArrayList<String> out = new ArrayList<>();
            if(input == null)
            {
                return out;
            }
        for (int i = 0; i < input.size(); i++)
        {
            String value = input.get(i);
            if(!out.contains(value))
            {
                out.add(value);
            }
        }
        return out;
    }
    static void main()
    {
        ArrayList<String> in = new ArrayList<>();

        in.add(0,"Lie");
        in.add(1,"Lay");
        in.add(2,"There");
        in.add(3,"Lay");
        in.add(4,"They're");
        in.add(5,"Die");
        in.add(6,"Dye");
        in.add(7,"There");
        in.add(8,"That");



        System.out.println(in);
        System.out.println("Duplicates detected: Indexes 4 and 7 are identical to previous indexes! Removing!");
        ArrayList<String> unique = uniqueOrderPreserving(in);

        System.out.println(unique);


    }
}

