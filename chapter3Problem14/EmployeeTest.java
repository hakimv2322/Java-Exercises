//Here, we test the Invoice class.
package chapter3Problem14;
import java.util.Scanner;
public class EmployeeTest {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        String myFirst, myLast;
        double myPay;
        
        Employee girl = new Employee("Alice",
                "Cat",
                72903.48);
        Employee boy = new Employee("Bob",
                "Dog",
                51756.99);
        
        System.out.printf(
                "Salaries of two employees.\n\n");
        
        girl.myDisplay();
        
        System.out.println();
        
        boy.myDisplay();
        
        System.out.println();
        
        System.out.print(
                "You may re-enter Bob's first name: ");
        myFirst = input.nextLine();
        
        System.out.print(
                "You may re-enter Bob's last name: ");
        myLast = input.nextLine();
        
        System.out.print(
                "You may re-enter Bob's monthly salary: ");
        myPay = input.nextDouble();
        
        boy.setFirst(myFirst);
        boy.setLast(myLast);
        boy.setPay(myPay);
        
        System.out.println();
        
        girl.myDisplay();
        
        System.out.println();
        
        boy.myDisplay();
        
        System.out.println();
        
    }
    
}