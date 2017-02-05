// Input value of each sold item for the week.
// Calculate the salesperson's paycheck for the week.

import java.util.Scanner;
public class ch4Problem19{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        double a = 239.99, b = 129.75, c = 99.95, d = 350.89;
        int item1, item2, item3, item4;
        double paycheck;
        
        System.out.print("Weekly salesperson paycheck.\nEnter the quantity of each item sold this week.\n\n");
        System.out.print("Item 1: ");
        item1 = input.nextInt();
        System.out.print("Item 2: ");
        item2 = input.nextInt();
        System.out.print("Item 3: ");
        item3 = input.nextInt();
        System.out.print("Item 4: ");
        item4 = input.nextInt();
        
        paycheck = (double) 200 + (0.09*((a*item1) + (b*item2) + (c*item3) + (d*item4)));
        
        System.out.printf("This week's paycheck: $%.2f\n", paycheck);
}
}