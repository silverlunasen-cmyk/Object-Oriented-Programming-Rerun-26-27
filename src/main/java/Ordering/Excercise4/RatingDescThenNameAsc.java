package Ordering.Excercise4;

import Ordering.Product;

import java.util.Comparator;

public class RatingDescThenNameAsc implements Comparator<Product>
{
    @Override public int compare(Product a, Product b)
    {
        int byRating = Double.compare(b.getRating(), a.getRating());
        if (byRating != 0)
        {
            return byRating;
        }
        return a.getName().compareTo(b.getName()); // asc
    }
}