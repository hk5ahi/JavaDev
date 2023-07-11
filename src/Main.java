// Java Basic Syntax Topic
import java.util.Scanner;

import inventory.InventoryManager;
import inventory.Product;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    // for problem 1
    Person p1=new Person("Muhammad Hanan",23,'M');
    p1.Display();
    // for problem 2
        Calculator c1=new Calculator();
        int i=0;
        String numb="";
        while(i!=-1){
            System.out.printf("Press 1 for Addition of two numbers:\n");
            System.out.printf("Press 2 for Subtraction of two numbers:\n");
            System.out.printf("Press 3 for Multiplication of two numbers:\n");
            System.out.printf("Press 4 for Division of two numbers:\n");
            System.out.printf("Press -1 to Quit:\n");

            numb = scan.nextLine();
            if (numb.equals("-1"))
            {
                System.out.printf("Calculator is closing\n");
                break;
            }
            System.out.printf("Please enter first number:\n");
            double n1=Double.parseDouble(scan.nextLine());
            System.out.printf("Please enter second number:\n");
            double n2=Double.parseDouble(scan.nextLine());

            if (numb.equals("1"))
            {
                c1.Addition(n1,n2);
            }
            else if (numb.equals("2"))
            {
                c1.Subtraction(n1,n2);
            }
            else if (numb.equals("3"))
            {
                c1.Multiplication(n1,n2);
            }
            else if (numb.equals("4"))
            {
                c1.Division(n1,n2);
            }



        }
        //problem 3
        Playable s1=new Guitar();
        s1.Sound();
        Playable s2=new Piano();

        s2.Sound();
        // Problem 4
        Product p=new Product();
        p.addProducts("Dairy Milk");
        p.addProducts("Bread");
        p.addProducts("Airpods");
        p.updateQuantities("Bread",4);
        InventoryManager iot=new InventoryManager();
        iot.getQuantities("Bread");
        //Problem 5
        BankAccount a1=new BankAccount(2211);
        a1.depositMoney(5040);
        a1.depositMoney(1000);
        a1.withdrawMoney(500);
        a1.withdrawMoney(34.4);
        a1.withdrawMoney(6000);
        BankAccount a2=new BankAccount(2345);
        a2.withdrawMoney(5);
        System.out.printf("The number of bank accounts are:"+ (BankAccount.BankAccounts));


    }
}