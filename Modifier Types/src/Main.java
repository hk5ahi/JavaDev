import Multiple.ThirdClass;
import Multiple.secondClass;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Problem 1: Design a package with multiple classes. Set different access control modifiers (public, protected, private) for the classes and their members, and try to access them from different classes within and outside the package.
     secondClass o2=new secondClass();
     ThirdClass o3=new ThirdClass();
     OutsideClass o4=new OutsideClass();

     //Problem 2:
        class1 b1=new class1();
        System.out.println(b1.getAge());
    }
}