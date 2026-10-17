package Fundementals.Exercise2;

public class Exercise
{
    static void main()
    {
        BankAccount bankAccount = new BankAccount(4000);

        System.out.println(bankAccount);

        bankAccount.deposit(35.00);

        System.out.println(bankAccount);

        bankAccount.withdraw(3500);

        System.out.println(bankAccount);


        //bankAccount.withdraw(580);

    }
}
