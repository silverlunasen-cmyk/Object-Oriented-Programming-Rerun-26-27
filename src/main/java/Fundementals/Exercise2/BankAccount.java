package Fundementals.Exercise2;

public class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        if(balance < 0)
        {
            throw new IllegalArgumentException("You can't have negative money!");
        }

        this.balance = balance;
    }

    public double deposit(double depositAmount)
    {
        this.balance += depositAmount;
        return balance;
    }
    public double withdraw(double withdrawalAmount)
    {
        if(this.balance < withdrawalAmount)
        {
            throw new IllegalArgumentException("You can't withdraw more than what is in your balance! Fool!");
        }
        this.balance -= withdrawalAmount;
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }
    @Override
    public String toString()
    {
        return "Current Balance: " + balance;
    }


}
