package Interfaces.Exercise6;

public class AddCommand implements Command
{
    public int val1;
    public int val2;
    public AddCommand(int val1, int val2)
    {
        this.val1 = val1;
        this.val2 = val2;
    }



    @Override
    public void execute()
    {
        int val3 = val1 + val2;
        System.out.println(val1 + "+" + val2 + "=" + val3);
    }

}
