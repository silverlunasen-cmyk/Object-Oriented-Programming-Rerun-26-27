package Inheritance.Exercise7;


public final class Square extends Shape {
    private final double side;

    public Square(double side) {
        if(side <= 0)
        {
            throw new IllegalArgumentException("The area cannot be negative!");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}