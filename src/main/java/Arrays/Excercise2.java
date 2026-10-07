import java.util.Arrays;

public static final void main(String[] args)
{
    System.out.println("The location of your requested number is index #" +indexOf(new int[]{3,5,1},2));
    System.out.println("The amount of times your requested number appears is " + count(new int[]{1,1,3,2},1) + " times");

}
static int indexOf(int[] arrayIndex, int target)
{
    for(int i = 0; i < arrayIndex.length; i++)
    {
        if(arrayIndex[i] == target)
        {
            return i;
        }
    }
    return -1;
}
static int count(int[] arrayCount, int target)
{
    int count = 0;

    for(int i = 0; i < arrayCount.length; i++)
    {
        if(arrayCount[i] == target)
        {
            count++;
        }
    }
    return count;
}
