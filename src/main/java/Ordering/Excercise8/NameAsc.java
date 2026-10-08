package Ordering.Excercise8;

import java.util.Comparator;

public class NameAsc implements Comparator<Product>
{
    @Override
    public int compare(Product a, Product b)
    {
        return a.getName().compareTo(b.getName());
    }
}
