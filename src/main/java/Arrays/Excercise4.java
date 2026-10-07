public static void main(String[] args)
{
    int[] scores = {2,2,3,4,12,24,34,54,46,76,56,67,89,99,34,5,66,85,57,77,45,34};
    int[] printStars = histogram(scores);

    System.out.print("00-09: ");
    for (int i = 0;i< printStars[0];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n10-19: ");
    for (int i = 0;i< printStars[1];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n20-29: ");
    for (int i = 0;i< printStars[2];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n30-39: ");
    for (int i = 0;i< printStars[3];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n40-49: ");
    for (int i = 0;i< printStars[4];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n50-59: ");
    for (int i = 0;i< printStars[5];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n60-69: ");
    for (int i = 0;i< printStars[6];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n70-79: ");
    for (int i = 0;i< printStars[7];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n80-89: ");
    for (int i = 0;i< printStars[8];i++)
    {
        System.out.print("*");
    }
    System.out.print("\n90-99: ");
    for (int i = 0;i< printStars[9];i++)
    {
        System.out.print("*");
    }
}

static int[] histogram(int[] scores){
        int[] bin = new int[11];

        for (int i = 1;i<scores.length+1;i++){
            int j = 0;
            j=scores[i-1]/10;
            bin[j]=bin[j]+1;
        }
        return bin;
    }

