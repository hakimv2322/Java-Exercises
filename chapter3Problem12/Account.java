//This is the Account class.
package chapter3Problem12;

import java.util.Scanner;

public class Account {
    
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    Scanner input = new Scanner( System.in );
    
    public Account( double initialBalance ){
        
        if ( initialBalance > 0.0 ){
            balance = initialBalance;
        }
        
    }
    
    public void credit( double amount ){
        balance = balance + amount;
    }
    
    public void debit( double withdraw ){
        if(withdraw<=balance){
            balance-=withdraw;
        }
        if(withdraw>balance){
            System.out.println(
                    "Debit amount exceeded account balance.");
        }
    }
    
    public void myPrint(String dummy){
        System.out.printf( "%s balance:$",
                dummy );
        System.out.printf("%.2f",balance);
        System.out.println();
    }
    
    public void myChanges(String dummy){
        
        System.out.printf( "Enter deposit amount for %s: ", dummy);
        depositAmount = input.nextDouble();
        
        System.out.printf( "\nadding %.2f to %s balance\n\n",
                depositAmount,dummy );
        
        credit( depositAmount );
        
        System.out.printf( "Enter withdraw amount for %s: ",dummy );
        withdrawAmount = input.nextDouble();
        
        debit(withdrawAmount);
        
    }
    
}
