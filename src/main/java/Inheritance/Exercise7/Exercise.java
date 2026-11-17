package Inheritance.Exercise7;

import java.util.List;

public class Exercise
{
    public static double totalArea(List<Shape> shapes)
    {
        double total = 0;
        for (Shape s : shapes)
        {
            total += s.area();
        }
        return total;
    }
    public static double largestRadius(List<Shape> shapes)
    {
        double largest = 0;
        for (Shape s : shapes)
        {
            if (s instanceof Circle c && c.radius() > largest)
            {
                largest = c.radius();
            }
        }
        return largest;
    }

    static void main()
    {
        List<Shape> shapes = List.of(new Circle(3), new Square(2), new Circle(3),
                new Rectangle(2, -5));
        System.out.printf("Total area: %.2f%n", totalArea(shapes));
        System.out.println("Largest radius: " + largestRadius(shapes));
    }
}
