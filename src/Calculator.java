//Implement a class called "Calculator" with methods to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. Test the class by performing calculations on different numbers.
public class Calculator
{
    private double num1;
    private double num2;
    private double result;

    void Addition(double n1,double n2)
    {
        result=n1+n2;
        Display();

    }
    void Subtraction(double n1,double n2)
    {
        result=n1-n2;
        Display();

    }
    void Multiplication(double n1,double n2)
    {
        result=n1*n2;
        Display();

    }
    void Division(double n1,double n2)
    {
        if (n2!=0) {
            result = n1 / n2;
            Display();
        }
        else {
            System.out.printf("The Division is not possible.\n");
        }
        }


    void Display()
    {
        System.out.printf("The result of operation is %f.\n",this.result);
    }


}