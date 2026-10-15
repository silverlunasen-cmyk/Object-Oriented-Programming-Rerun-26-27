package Equality.Exercise6;

import java.util.Objects;

public class Exercise
{
    static void main()
    {
        Customer a = new Customer("Crank", "Sheep@Bahhhmail.com");
        Customer b = new Customer("Crank", "Horse@Neighmail.com");
        Customer c = new Customer("Drank", "Sheep@Bahhhmail.com");

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equals(c) = " + a.equals(c));
        System.out.println("hash(a) == hash(b) ? " + (a.hashCode() == b.hashCode()));
    }
    public static final class Customer
    {
        private final String id;
        private final String email;

        public Customer(String id, String email) {
            this.id = id;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Customer other)) {
                return false;
            }
            return Objects.equals(this.id, other.id);
        }

        @Override public int hashCode()
        {
            return Objects.hash(id);
        }

    }
}
