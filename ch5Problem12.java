// Finding the product of odd integers from one to n.

import java.util.Scanner;
public class ch5Problem12{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int counter = 1, product = 1;
        int number;
        
        System.out.println(
                "Finding the product of odd integers from one to n.");
        System.out.print("Enter a positive odd integer (like 15): ");
        number = input.nextInt();
        
        while(counter <= number){
        product *= counter;
        counter += 2;
        }
        
        switch( number%2 ){
            
            case 1:
            System.out.printf("Product of odd integers from 1 to %d: ", number);
            System.out.println(product);
            break;
                
            case 0:
            System.out.println(
                    "The number entered was an even number.");
            break;
                
            default:
            System.out.println(
                    "Error.");
            break;
        
        }
    }
}