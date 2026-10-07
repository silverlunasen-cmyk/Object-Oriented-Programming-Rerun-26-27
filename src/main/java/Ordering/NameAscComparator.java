package Ordering;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Product>
{
    @Override
    public int compare(Product a, Product b)
    {
/*        if(a.getName() == b.getName())
        {
            if(a.getPrice() == b.getPrice())
            {
                return Double.compare(a.getRating(), b.getRating());
            }
            return Double.compare(a.getPrice(), b.getPrice());

        }*/
        return a.getName().compareTo(b.getName());
    }
}
