import java.util.Scanner;

// Problem 1: Create a custom exception class called InvalidInputException. Write a program that takes user input and throws this exception if the input is not valid (e.g., a negative number or a non-numeric value).
public class Main {
    public static void main(String[] args) throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Please enter a number:");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num < 0) {
                    throw new InvalidInputException("The number is negative");
                }
                validInput = true;
            } catch (NumberFormatException b) {
                System.out.println("Error occurred which is " + b.getMessage());
            } catch (InvalidInputException a) {
                System.out.println("The error is:" + a.getMessage());


            } finally {
                if (validInput) {
                    System.out.println("The program is closed.");
                } else {
                    System.out.println("The program is not closed.");
                }
            }
        }
    }
}
