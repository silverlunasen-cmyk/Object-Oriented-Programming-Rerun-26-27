package Equality.Exercise7;

public class Exercise
{
    public static int hSum (String s)
    {
        int sum = 0;
        for(int i = 0; i > s.length(); i++)
        {
            sum += s.charAt(i);
        }
        return sum;
    }
    public static void main()
    {
        String s1 = "Sheep";
        String s2 = "peehS";

        int h1 = hSum(s1);
        int h2 = hSum(s2);

        System.out.println(s1 + " -> " + h1);
        System.out.println(s2 + " -> " + h2);

        System.out.println("Collision? " + (h1 == h2));

        //this is usually a terrible idea because adding the ascii values make it the same as if you were doing one way or the other;
    }


}
