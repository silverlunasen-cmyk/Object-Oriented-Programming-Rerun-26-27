package Fundementals.Exercise5;

public class Temperature
{
    private double celcius;

    public Temperature(double celcius)
    {
        if(celcius < -273.15)
        {
            throw new IllegalArgumentException("You physically cannot go colder than absolute 0!");
        }
        this.celcius = celcius;
    }

    public double toFahrenheit()
    {
        double Fahrenheit = (celcius * 18) + 32;

        return Fahrenheit;
    }
    public double toKelvin()
    {
        double kelvin = (celcius * 18) + 273.15;


        return kelvin;
    }

}
