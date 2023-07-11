//Problem: Create a class called "Rectangle" with attributes like "length" and "width." Implement methods to calculate the area and perimeter of a rectangle object. Create multiple rectangle objects and perform calculations on them.
public class Rectangle {

    private double length;
    private double width;

    Rectangle(double l,double w)
    {
        this.length=l;
        this.width=w;
    }

    void calculateArea()
    {

        double area=width*length;
        System.out.printf("The Area of the rectangle with length %f and width %f is %f.\n",length,width,area);

    }

    void calculatePerimeter()
    {

        double peri=2*(length+width);
        System.out.printf("The Perimeter of the rectangle with length %f and width %f is %f.\n",length,width,peri);

    }

}
