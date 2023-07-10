// Problem 1: Create a class called "Person" with attributes like "name" and "age." Implement a method that prints the person's name and age.
public class Person
{
    private String name;
    private int age;
    private char Gender;
    Person(String name, int age,char Gender)
    {
        this.name=name;
        this.age=age;
        this.Gender=Gender;

    }
    void Display()
    {
        String g="";
        if (Gender=='M')
        {
            g="his";
        }
        else if (Gender=='F')
        {
            g="her";
        }
        System.out.printf("The name of person is %s and %s age is %d. \n",this.name,g,this.age);

    }


}