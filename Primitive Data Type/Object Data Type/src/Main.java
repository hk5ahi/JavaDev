import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
// problem 1
        Student s1=new Student("Muhammad Hanan",23);
        Student s2=new Student("Umer Ghega",22);
        Student s3=new Student("Huzaifa Waseem",24);

        Student[] Students={s1,s2,s3};

        for (int i=0;i<Students.length;i++)
        {
            System.out.printf("The student name is %s and age is %d.\n",Students[i].name,Students[i].age);

        }
//problem 2

        Person p1=new Person();
        p1.setName("Muhammad Hanan");
        p1.setAddress("lahore");
        System.out.printf("The name is %s.\n",p1.getName());
        System.out.printf("The address is %s.\n",p1.getAddress());
    }
}