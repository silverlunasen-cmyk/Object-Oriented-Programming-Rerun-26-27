package Ordering.Excercise2;

import Ordering.NameAscComparator;
import Ordering.Product;

import java.util.ArrayList;
import java.util.List;
//Task: Define Product(name:String, price:double, rating:double).
// Create NameAscComparator that sorts products by name A–Z.

public class Excercise
{
    static void main()
    {
        List<Product> items = new ArrayList<>();
        items.add(new Product("Desk Fan", 45.00, 23.1));
        items.add(new Product("Computer", 23.99, 5));
        items.add(new Product("Desk Fan", 48.00, 24.6));
        items.add(new Product("Laptop", 444, 1));
        items.add(new Product("Desk Fan", 48.00, 27.1));
        items.add(new Product("Frank Keenan", 33, 5));

        items.sort(new NameAscComparator());
        System.out.println(items);
    }

}
