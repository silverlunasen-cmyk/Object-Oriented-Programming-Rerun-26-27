package Fundementals.Exercise1;

//Define a Book class with private fields title (String) and pageCount (int).
//
//    Constructor: validate that title is not blank and pageCount > 0; throw IllegalArgumentException otherwise.
//    Getters for both fields.
//    Override toString() to return "Title (N pages)".

public class Exercise
{

        static void main()
        {
            Book book1 = new Book(null, 44);
            Book book2 = new Book("Coffee", 33);

            System.out.println(book1);
            System.out.println(book2);
        }

}
