//Write a program to find the sum of all elements in an array using a for-each loop. Create an array of integers and calculate the sum of all elements in the array using a for-each loop.
public class Main {
    public static void main(String[] args) {

    int[] numbers={5,7,2,4,66,34,12,76,90};
    int sum=0;
    for (int num:numbers)
    {
        sum+=num;
    }
    System.out.println("The sum of numbers is:"+sum);
    }
}