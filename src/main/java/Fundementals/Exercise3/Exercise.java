package Fundementals.Exercise3;

public class Exercise
{
    static void main()
    {
        Rectangle rectangle1 = new Rectangle(44,23);
        Rectangle rectangle2 = new Rectangle(2,2);

        System.out.println(rectangle1.Area());//should be 1012;

        System.out.println(rectangle1.Perimeter());//should be 134;

        System.out.println("is this square? " + rectangle2.isSquare());
    }

}
