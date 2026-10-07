public static void main(String[] args)
{

}

static double[][] normalize(int[][] heat)
{
    if (heat == null) return null;
    int rows = heat.length;
    int max = 0;
    for (int r = 0; r < rows; r++)
    {
        for (int c = 0; c < heat[r].length; c++)
        {
            if(heat[r][c] > max)
            {
                max = heat[r][c];
            }
        }
    }
    double[][] result = new double[heat.length][];
    for(int i = 0; i < heat.length;i++)
    {
        result[i] = new double[heat[i].length];
        for(int j=0; j < heat.length;j++)
        {
            result[i][j] = result[i][j]/(double) max;
        }
    }
    return result;

}