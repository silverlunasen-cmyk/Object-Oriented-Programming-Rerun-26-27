package Inheritance.Exercise7;

public final class Circle extends Shape {
    final double radius;

    public Circle(double radius)
    {
        if(radius <= 0)
        {
            throw new IllegalArgumentException("You cannot make it a negative size!");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double radius()
    {
        return radius;
    }
}
