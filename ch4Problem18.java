// Input customer's information for the month.
// Deliver information about the customer's credit limit.

import java.util.Scanner;
public class ch4Problem18{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int accountnumber = 0, oldbalance = 0, newbalance = 0;
        int charges = 0, credits = 0, creditlimit = 0;
        
        System.out.printf("Enter the customer's information.\n");
        System.out.print("Account number: ");
        accountnumber = input.nextInt();
        System.out.print("Balance at the beginning of the month: ");
        oldbalance = input.nextInt();
        System.out.print("Total charged by the customer this month: ");
        charges = input.nextInt();
        System.out.print("Total credits applied this month: ");
        credits = input.nextInt();
        System.out.print("Allowed credit limit: ");
        creditlimit = input.nextInt();
        System.out.println();
        
        newbalance = oldbalance + charges - credits;
        
        System.out.printf("Account number: %d\n",accountnumber);
        System.out.printf("New balance: %d\n", newbalance);
        System.out.printf("Credit limit: %d\n", creditlimit);
        if(newbalance > creditlimit){
            System.out.printf("Credit limit exceeded\n");
        }
}
}