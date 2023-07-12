
public class Main {
    public static void main(String[] args) {
    // Problem 1: Create a class to represent a library. Define a static variable to keep track of the total number of books in the library. Implement methods to add and remove books, updating the static variable accordingly.
        Library b1=new Library();
        b1.addBook();
        b1.Display();
        Library b2=new Library();
        b2.addBook();
        b2.removeBook();
        b2.Display();
        System.out.println("The number of Books are: "+Library.noOfBooks);

        // Problem 2: Implement a class to represent a math utility. Define a static variable to store the value of pi. Write methods to calculate the circumference and area of a circle using the static pi value.
        Circle c1=new Circle();
        c1.calculateCircumference(5);
        c1.calculateArea(5);
    }

}