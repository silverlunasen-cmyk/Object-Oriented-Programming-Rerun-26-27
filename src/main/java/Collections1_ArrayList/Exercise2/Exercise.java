package Collections1_ArrayList.Exercise2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Exercise
{
    static ArrayList<Integer> toList(int[] xs)
    {
        ArrayList<Integer> out = new ArrayList<>();//adds this to a new arrayList;
        if (xs == null)
            return out;

        for (int x : xs) {//whenever something is inside this array, it adds it to the arrayList;
            out.add(x);
        }
        return out;
    }
    public static int[] toArray(ArrayList<Integer> list) {
        if (list == null)//if the list is empty it gives nothing
            return new int[0];

        int[] result = new int[list.size()];//the array is set to be the size of the arrayList;
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

        //alternatively could use arrayList.toArray(), which automatically converts it without having to use a for loop;
    }

    static void main()
    {
        int[] a = {1,5,2,5,23};

        ArrayList<Integer> aList = toList(a);

        int[] b = toArray(aList);

        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("------------------");
        System.out.println("BZZZT! CONVERTING TO ARRAY LIST!");
        System.out.println("------------------");
        for(int i = 0; i < aList.size(); i++)
        {
            System.out.println(aList.get(i));
        }
        System.out.println("------------------");
        System.out.println("BZZZT! CONVERTING BACK TO ARRAY!");
        System.out.println("------------------");
        for(int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }



}
}
