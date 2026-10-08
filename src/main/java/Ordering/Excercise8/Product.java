package Ordering.Excercise8;

public final class Product
{
        private final String name;
        private final double price;
        private final double rating;

    public Product(String name, double price, double rating)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public double getRating()
    {
        return rating;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
