package Ordering.Excercise5;

import Ordering.NameAscComparator;
import Ordering.Product;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

//Task: Show that two-pass sorting is stable on lists. First sort by name A–Z, then by price low to high.

public class Excercise
{
    static void main()
    {
        List<Product> items = new ArrayList<>();
        items.add(new Product("Desk Fan", 45.00, 23.1));
        items.add(new Product("Computer", 23.99, 5.2));
        items.add(new Product("Desk Fan", 48.00, 24.6));
        items.add(new Product("Laptop", 444, 1.7));
        items.add(new Product("Desk Fan", 48.00, 27.1));
        items.add(new Product("Frank Keenan", 33, 5.1));

        items.sort(new NameAscComparator());
        System.out.println("Here's the items sorted by name: " +  '\n' + items);

        Comparator<Product> priceAsc = new Comparator<Product>()
        {
            @Override public int compare(Product a, Product b)
            {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        };

        items.sort(priceAsc);

        System.out.println("Here's the items sorted by ascending price: " + '\n' + items);

    }

}
