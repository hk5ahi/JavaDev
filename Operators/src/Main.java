import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.printf("Please enter first number:\n");
        int n1=Integer.parseInt(scan.nextLine());
        System.out.printf("Please enter second number:\n");
        int n2=Integer.parseInt(scan.nextLine());

        Operator o=new Operator();
        o.bitwiseAND(n1,n2);
        o.evenanddivisiblyby3(6);
        System.out.printf("Please enter your age:\n");
        int n3=Integer.parseInt(scan.nextLine());
        o.votedecision(n3);
    }
}