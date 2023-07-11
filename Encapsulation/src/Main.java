
public class Main {
    public static void main(String[] args) {

        BankAccount c1=new BankAccount();
        c1.Deposit();
        c1.Withdraw();
        c1.setBalance(500);
        System.out.println("The account balance is: "+ c1.getBalance());
        c1.setBalance(1500);
        System.out.println("The account balance is: "+ c1.getBalance());
    }
}