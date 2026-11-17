package Inheritance.Exercise6;

public class FancyFormatter extends BaseFormatter {
    @Override
    public String format()
    {
        return "Fancy format";
    }

    public String format(String prefix) {
        return prefix + " Fancy format";
    }

}