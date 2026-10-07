import java.util.Arrays;

public static final void main(String[] args)
{
    int[] newArray=fillWith(0,0);
    System.out.println(Arrays.toString(newArray));



    System.out.println("the sum of the array is:  " + sum(newArray));

    System.out.println("the average of the array is " + average(newArray));
}
static int[] fillWith(int n, int value)
{
    int[] array1D=new int[n];
    for(int i=0; i <array1D.length; i++)
    {
        array1D[i]=value;
    }
    return array1D;

}
static int sum(int[]arraySum)
{
    int total = 0;

    for(int i=0; i <arraySum.length; i++)
    {
        total = arraySum[i] + total;
    }
    return total;

}
static double average(int[]arrayAverage)
{
    if(arrayAverage.length == 0)
    {
        throw new IllegalArgumentException("The array has to have values in it!");
    }
    double average = 0;
    int total = 0;
    for(int i = 0; i < arrayAverage.length; i++)
    {
        total = arrayAverage[i] + total;
        average = total / arrayAverage.length;
    }
    return average;
}