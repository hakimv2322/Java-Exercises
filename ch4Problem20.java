// Find the weekly gross pay of each employee of a company.

import java.util.Scanner;
public class ch4Problem20{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        double hours1, hours2, hours3;
        double rate1, rate2, rate3;
        double paycheck1, paycheck2, paycheck3;
        
        System.out.printf("Weekly employee paycheck.\n\n");
        System.out.print("Enter number of hours of first employee: ");
        hours1 = input.nextDouble();
        System.out.print("Enter hourly rate of first employee: ");
        rate1 = input.nextDouble();
        System.out.print("Enter number of hours of second employee: ");
        hours2 = input.nextDouble();
        System.out.print("Enter hourly rate of second employee: ");
        rate2 = input.nextDouble();
        System.out.print("Enter number of hours of third employee: ");
        hours3 = input.nextDouble();
        System.out.print("Enter hourly rate of third employee: ");
        rate3 = input.nextDouble();
        System.out.println();
        
        if(hours1 > 40){
            paycheck1 = (40*rate1) + ((hours1 - 40)*(1.5*rate1));
        } else{
            paycheck1 = hours1*rate1;
        }
        if(hours2 > 40){
            paycheck2 = (40*rate2) + ((hours2 - 40)*(1.5*rate2));
        } else{
            paycheck2 = hours2*rate2;
        }
        if(hours3 > 40){
            paycheck3 = (40*rate3) + ((hours3 - 40)*(1.5*rate3));
        } else{
            paycheck3 = hours3*rate3;
        }
        System.out.printf("First employee's paycheck: $%.2f\n", paycheck1);
        System.out.printf("Second employee's paycheck: $%.2f\n", paycheck2);
        System.out.printf("Third employee's paycheck: $%.2f\n", paycheck3);

}
}