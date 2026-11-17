package Inheritance.Exercise7;

public sealed abstract class Shape permits Circle, Square, Rectangle
{
    public abstract double area();

}
