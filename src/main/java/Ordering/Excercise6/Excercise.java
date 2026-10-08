package Ordering.Excercise6;

import java.util.ArrayList;
import java.util.List;

public class Excercise
{
    static void main()
    {
        List<NewProduct> items = new ArrayList<>();
        items.add(new NewProduct("Desk Fan", 45.00, 23.1));
        items.add(new NewProduct("Computer", 23.99, 5.3));
        items.add(new NewProduct("Desk Fan", 48.00, 24.6));
        items.add(new NewProduct("Marshmallow", 22.55, null));
        items.add(new NewProduct("Laptop", 444, 1.3));
        items.add(new NewProduct("Desk Fan", 48.00, 27.1));
        items.add(new NewProduct("Frank Keenan", 33, 5.2));


        items.sort(new NewCompare());
        System.out.println(items);
    }
}
