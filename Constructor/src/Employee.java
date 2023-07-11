//: Create a class called "Employee" with attributes like "name" and "salary." Implement a parameterized constructor to initialize the employee object with name and salary values. Create employee objects with different values using the constructor.
public class Employee {

    private String name;
    private double Salary;

    Employee(String name,double Salary)
    {
        this.name=name;
        this.Salary=Salary;

    }

    void Display()
    {
        System.out.printf("The Employee name is %s and its salary is %f.\n",name,Salary);


    }

}
