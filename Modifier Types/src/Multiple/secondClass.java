package Multiple;

public class secondClass {

    public String nam1;

    public secondClass()
    {
        FirstClass o1=new FirstClass();
        this.nam1=o1.address;
        System.out.println(nam1);
    }
}
