package Ordering.Excercise4;

import java.util.ArrayList;
import java.util.List;
import Ordering.Product;

public class Excercise
{
    static void main()
    {
        List<Product> items = new ArrayList<>();
        items.add(new Product("Monitor", 120.0, 4.5));
        items.add(new Product("Mouse", 15.0, 4.5));   // tie on rating
        items.add(new Product("Keyboard", 45.0, 4.1));

        items.sort(new RatingDescThenNameAsc());
        System.out.println(items);

    }
}
