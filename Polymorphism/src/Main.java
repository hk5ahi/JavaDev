
public class Main {
    public static void main(String[] args) {
    //Problem 1:  Create a class called "Shape" with a method called "draw" that prints "Drawing a shape." Create subclasses for different shapes like "Circle," "Rectangle," and "Triangle" that override the "draw" method to print the shape-specific drawing. Create objects of each subclass and invoke the "draw" method to demonstrate polymorphism.
    Shape s=new Shape();
    s.Draw();

    Shape c=new Circle();
    c.Draw();

    Shape r=new Rectangle();
    r.Draw();

    Shape t=new Triangle();
    t.Draw();
        System.out.println('\n');
    // Problem 2: Create a class hierarchy for vehicles, including a base class called "Vehicle" and subclasses like "Car," "Motorcycle," and "Truck." Implement a method called "accelerate" in the base class and override it in the subclasses with different implementations. Create objects of each subclass, invoke the "accelerate" method, and observe the polymorphic behavior.
    Vehicle v=new Vehicle();
    v.accelerate();

    Vehicle car21=new Car();
    car21.accelerate();

    Vehicle m=new Motorcycle();
    m.accelerate();

    Vehicle tr=new Truck();
    tr.accelerate();
    }
}
