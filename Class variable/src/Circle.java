public class Circle
{
    private static double PI=3.1416;

    void calculateCircumference(double r)
    {
        double c=2*PI*r;
        System.out.printf("The Circumference of the circle is %f.\n",c);

    }
    void calculateArea(double r)
    {
        double c=r*PI*r;
        System.out.printf("The Area of the circle is %f.\n",c);

    }
}
