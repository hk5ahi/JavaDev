
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        //problem 1
        //Write a program to display the current date and time.
        LocalDate date =LocalDate.now();
        System.out.printf("The Local date is:"+ date+'\n');
        LocalTime time =LocalTime.now();
        System.out.printf("The Local time is:"+ time+'\n'+ '\n');
        //problem 2
        // Write a program to calculate the duration between two given dates. Take two dates as input from the user and calculate the duration in years, months, and days between the two dates using the java.time.LocalDate class. Display the duration.
        LocalDate startDate = LocalDate.parse("2020-01-25");
        LocalDate endDate = LocalDate.parse("2023-08-20");
        Period d = Period.between(startDate, endDate);
        int c= d.getMonths();
        int e= d.getDays();
        int f= d.getYears();
        System.out.println("The duration between two dates in days is:"+e);
        System.out.println("The duration between two dates in months is:"+c);
        System.out.println("The duration between two dates in years is:"+f);



    }
}