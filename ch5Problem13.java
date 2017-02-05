// Listing the factorials of integers from one to n.

import java.util.Scanner;
public class ch5Problem13{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int product = 1;
        int number;
        
        System.out.println(
                "Listing the factorials of integers from one to n.");
        System.out.print("Enter a positive integer (like 5): ");
        number = input.nextInt();
        
        System.out.printf("%10s%20s\n", "Number","Factorial");
        
        for(int i = 0; i < number; i++){
            product *= (i+1);
            System.out.printf("%10d%20d\n", i+1, product);
        }
    }
}