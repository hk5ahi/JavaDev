public class Car {

    private String model;
    private int year;

    Car()
    {
        this.model="GLI";
        this.year=2017;

    }
    Car(String model, int year)
    {
        this.model=model;
        this.year=year;
    }
    void Display()
    {
        System.out.printf("The Car model is %s and its year is %d.\n",model,year);

    }
}
