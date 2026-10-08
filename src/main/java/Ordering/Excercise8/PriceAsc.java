package Ordering.Excercise8;

import java.util.Comparator;

public class PriceAsc implements Comparator<Product>
{
    @Override
    public int compare(Product a, Product b)
    {
        return Double.compare(a.getPrice(), b.getPrice());
    }
}
