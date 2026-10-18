package Fundementals.Exercise5;

public class Exercise
{
    static void main()
    {
        Temperature t = new Temperature(0);

        System.out.println(t.toKelvin());//should be 273.15;

        System.out.println(t.toFahrenheit());//should be 32;

        Temperature invalid = new Temperature(-274);
    }
}
