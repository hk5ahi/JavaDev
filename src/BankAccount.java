//Problem: Create a class called "BankAccount" with attributes like "accountNumber" and "balance." Implement methods to deposit and withdraw money from the account. Add a static variable to track the total number of bank accounts created.
public class BankAccount {

    private int AccountNumber;
    private double Balance;
    public static int BankAccounts=0;

    BankAccount(int Acct)
    {
        BankAccounts++;
        this.AccountNumber=Acct;
        Balance=0;
        System.out.printf("\nThe Account has been created successfully with balance %f.\n",this.Balance);


    }
    void depositMoney(double amount)
    {
        this.Balance+=amount;
        System.out.printf("The amount %f has been added successfully in the account.\n",amount);

    }

    void withdrawMoney(double amount)
    {
        if(this.Balance>=amount){
            this.Balance-=amount;
            System.out.printf("The amount %f has been withdrawn successfully from the account with current balance is %f.\n",amount,this.Balance);}
        else {
            System.out.printf("Insufficient Balance\n");
        }
        }

    }

