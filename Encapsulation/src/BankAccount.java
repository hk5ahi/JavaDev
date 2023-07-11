public class BankAccount {

    private int accountNumber;
    private double Balance;

    void setBalance(double n)
    {
        this.Balance=n;
    }

    double getBalance()
    {
        return this.Balance;
    }
    void Deposit()
    {
        System.out.println("The implementation of depositing money here.");

    }

    void Withdraw()
    {
        System.out.println("The implementation of withdrawing money here.");

    }


}
