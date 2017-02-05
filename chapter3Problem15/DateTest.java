//Here, we test the Date class.
package chapter3Problem15;
import java.util.Scanner;
public class DateTest {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        int myMonth, myDay, myYear;
        
        Date today = new Date(8,
                29,
                1995);
        
        System.out.printf(
                "Entering the Date.\n\n");
        
        System.out.printf("Current date:\n");
        today.displayDate();
        
        System.out.println();
        
        System.out.println();
        
        System.out.print(
                "You may re-enter the month: ");
        myMonth = input.nextInt();
        
        System.out.print(
                "You may re-enter the day: ");
        myDay = input.nextInt();
        
        System.out.print(
                "You may re-enter the year: ");
        myYear = input.nextInt();
        
        today.setMonth(myMonth);
        today.setDay(myDay);
        today.setYear(myYear);
        
        System.out.println();
        
        System.out.printf("New date:\n");
        today.displayDate();
        
        System.out.println();
        System.out.println();
        
    }
    
}