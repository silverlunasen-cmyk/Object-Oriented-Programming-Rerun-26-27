package Inheritance.Exercise6;

public class Exercise {

    static void main() {
        BaseFormatter a = new BaseFormatter();
        BaseFormatter b = new FancyFormatter();

        System.out.println(a.format()); // Base format
        System.out.println(b.format()); // Fancy format
    }
}