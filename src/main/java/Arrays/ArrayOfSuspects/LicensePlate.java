package Arrays.ArrayOfSuspects;

public class LicensePlate
{
    private String year;
    private String county;
    private String number;

    public LicensePlate(String fullLicensePlate)
    {
        String[] parts = fullLicensePlate.split("\\s");

        if(parts.length == 3)
        {
            this.year = parts[0];
            this.county = parts[1];
            this.number = parts[2];
        }
    }
    public boolean validate(int targetYearSum, String targetCounty, String targetNumber)
    {
        boolean isTargetCounty = this.county.matches(targetCounty);
        boolean isTargetNumber = this.number.matches(targetNumber);

        int sum = 0;

        for (int i = 0; i < year.length(); i++)
        {
            int yearNum = this.year.charAt(i);
            sum += yearNum;
        }

        return isTargetCounty && isTargetNumber && (sum == targetYearSum);
    }
    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "LicensePlate{" +
                "year='" + year + '\'' +
                ", county='" + county + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

