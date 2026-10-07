import java.util.Arrays;

public static void main(String[] args)
{
    int[] array = new int[]{2,5,8,2,4,1,5,3,12,25};
    System.out.println("You have the array with the following numbers: " + array.toString());
    System.out.println("The maximum in your array is: " + max(array));
    System.out.println("The minimum in your array is: " + min(array));

}
static int min(int[] arrayMin)
{
    int minimum = Integer.MAX_VALUE;

    for (int i = 0; i < arrayMin.length; i++)
    {
        if(arrayMin[i] < minimum)
        {
            minimum = arrayMin[i];
        }
    }
    return minimum;
}
static int max(int[] arrayMax)
{
    int maximum = Integer.MIN_VALUE;

    for (int i = 0; i < arrayMax.length; i++)
    {
        if(arrayMax[i] > maximum)
        {
            maximum = arrayMax[i];
        }
    }
    return maximum;
}