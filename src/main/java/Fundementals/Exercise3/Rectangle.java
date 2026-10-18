package Fundementals.Exercise3;

//Define a Rectangle class with width and height fields (both doubles, both > 0).
//
//    Full constructor: Rectangle(double width, double height).
//    Convenience constructor: Rectangle(double side) — creates a square using this(side, side).
//    Methods: area(), perimeter(), isSquare().
//    Override toString().

public class Rectangle
{

    private final double width;
    private final double height;

    public Rectangle(double width, double height)
    {
        if(width < 0 || height < 0)
        {
            throw new IllegalArgumentException("You can't have a value of less than 1!");
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side)
    {
        this(side, side);
    }

    public double Area()
    {
        double area = 0;

        area = width * height;

        return area;
    }

    public double Perimeter()
    {
        double perimeter = 0;

        perimeter = width + height + width + height;

        return perimeter;
    }

    public boolean isSquare()
    {
        if(width == height)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle: the width is (" + width + ") and your height is (" + height + ")";
    }
}
