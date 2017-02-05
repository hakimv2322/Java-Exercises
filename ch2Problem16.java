// Exercise 2.16
// Comparing two integers.

import java.util.Scanner;
public class ch2Problem16 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        
        System.out.print("Enter first integer:");
        number1 = input.nextInt();
        
        System.out.print("Enter second integer:");
        number2 = input.nextInt();
        
        if(number1 == number2)
            System.out.print("These numbers are equal.\n");
        
        if(number1 > number2)
            System.out.printf("%d is larger than %d.\n",number1,number2);
        
        if(number1 < number2)
            System.out.printf("%d is larger than %d.\n",number2,number1);
        
       
    }
}

