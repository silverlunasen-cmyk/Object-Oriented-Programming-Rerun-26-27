package Ordering.Excercise3;
import java.util.Comparator;
import Ordering.Product;
import java.util.ArrayList;
import java.util.List;

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

        java.util.Comparator<Product> priceAsc = new java.util.Comparator<Product>()
        {
            @Override public int compare(Product a, Product b)
            {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        };

        items.sort(priceAsc);



    }

}
