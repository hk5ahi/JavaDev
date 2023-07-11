// Write a program to display the name of a day of the week based on a given number using a switch statement. Take the number as input from the user and use a switch statement to match the number with the corresponding day of the week and display its name.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7:");
        int n=Integer.parseInt(scan.nextLine());

        switch (n)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No match found");

        }

    }
}