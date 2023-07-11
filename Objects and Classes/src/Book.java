//Problem: Create a class called "Book" with attributes like "title," "author," and "price." Implement a method to display the book information. Create multiple Book objects and display their details.
public class Book {

    private String Title;
    private String Author;
    private double Price;

    Book(String title,String Author,double Price)
    {
        this.Title=title;
        this.Author=Author;
        this.Price=Price;
    }

    void Display()
    {

        System.out.printf("The title of Book is %s written by %s with the price of %f",Title,Author,Price);

    }
}
