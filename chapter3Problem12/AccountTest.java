//Here, we test the Account class.
package chapter3Problem12;

public class AccountTest {
    
    public static void main( String args[] ){
        
        Account account1 = new Account( 50.00 );
        Account account2 = new Account( -7.53 );
        Account account3 = new Account(119.36);
        
        account1.myPrint("account1");
        account2.myPrint("account2");
        account3.myPrint("account3");        
        
    account1.myChanges("account1");
        
        account1.myPrint("account1");
        account2.myPrint("account2");
        account3.myPrint("account3");
        
    account2.myChanges("account2");
        
        account1.myPrint("account1");
        account2.myPrint("account2");
        account3.myPrint("account3");
        
    account3.myChanges("account3");
    
        account1.myPrint("account1");
        account2.myPrint("account2");
        account3.myPrint("account3");
        
    }
    
}
