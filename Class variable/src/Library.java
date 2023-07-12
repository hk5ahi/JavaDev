public class Library {

    public static int noOfBooks=0;

    Library()
    {
        System.out.println("The Student has registered to buy book.\n");
    }

    void addBook()
    {
        noOfBooks++;
        System.out.println("The Book has been added successfully.");

    }

    void removeBook()
    {
        noOfBooks--;
        System.out.println("The Book has been removed successfully.");

    }

    void Display()
    {
        System.out.printf("The number of Books in Library are %d.\n",noOfBooks);
    }

}
