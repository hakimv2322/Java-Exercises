// Enter a nonnegative integer and compute its factorial.

import java.util.Scanner;
public class ch4Problem38A{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int number = 0, factorial = 1;
        
        System.out.print("Enter a nonnegative integer: ");
        number = input.nextInt();
        
        while(number > 1){
            factorial *= (number--);
        }
        
        System.out.printf("Its factorial: %d\n", factorial);
}
}