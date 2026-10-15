package Equality.Exercise1;

public class Exercise
{
    static void main()
    {
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);       // expect false
        System.out.println(a.equals(b));  // expect true

        //== checks the memory, while a.equals(b)) looks at the characters;
    }
}