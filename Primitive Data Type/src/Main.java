import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {

        //Write a program to calculate the area of a circle. Take the radius as input from the user using the Scanner class. Use the double data type for the radius and the Math class to perform calculations.
        Scanner s=new Scanner(System.in);
        double area=0;
        System.out.println("Please enter the radius to find the Area of Circle");
        double r=Double.parseDouble(s.nextLine());
        area=PI*r*r;
        System.out.printf("The Area of Circle is %f.\n",area);

    }

}