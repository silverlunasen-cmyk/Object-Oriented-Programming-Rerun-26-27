package Ordering.Excercise8;

import java.util.Comparator;

public class RatingDesc implements Comparator<Product>
{
    @Override
    public int compare(Product a, Product b)
    {
        return Double.compare(b.getPrice(), a.getPrice());
    }
}
