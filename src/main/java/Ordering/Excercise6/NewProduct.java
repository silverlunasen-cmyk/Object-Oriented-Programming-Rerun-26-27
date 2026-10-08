package Ordering.Excercise6;


    public class NewProduct
    {
        private String name;
        private double price;
        private Double rating;

        public NewProduct(String name, double price, Double rating)
        {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public String name()
        {
            return name;
        }
        public double price()
        {
            return price;
        }
        public Double rating()
        {
            return rating;
        }

        @Override public String toString()
        {
            return "Product: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '\n';
        }
    }

