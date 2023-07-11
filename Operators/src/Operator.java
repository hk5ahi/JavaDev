//Write a program to perform a bitwise AND operation between two given integers. Take the integers as input from the user and use the bitwise operator to perform the operation. Display the result.
//Write a program to check if a given number is both even and divisible by 3. Take the number as input from the user and use the logical operators to perform the check. Display whether the number satisfies both conditions.
//Write a program to determine if a person is eligible to vote. Take the person's age as input from the user and use the conditional operator to check if the age is greater than or equal to 18. Display whether the person is eligible to vote.
public class Operator {

    private int number1;
    private int number2;

    Operator()
    {

        this.number1=this.number2=0;
    }

    void bitwiseAND(int n1,int n2)

    {
        int result=n1 & n2;
        System.out.printf("The result of bitwise AND is %d.\n",result);

    }

    void evenanddivisiblyby3 (int n1)
    {
        if(n1 %2==0 && n1%3==0)
        {
            System.out.println("Condition is satisfied as number is even and divisible by 3.");
        }
        else{

            System.out.println("Condition is not satisfied.\n");
        }

    }

    void votedecision(int n1)
    {
        if(n1>=18)
        {
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Not Eligible to vote.");
        }
        }
    }

