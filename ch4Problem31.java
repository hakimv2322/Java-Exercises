// Input a binary integer and output the base-10 equivalent.

import java.util.Scanner;
public class ch4Problem31{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int binary = 0, decimal  = 0;
        int power2 = 0, power10 = 0;
        int counter = 1, i = 0;
        
        System.out.print("Enter a binary integer: ");
        binary = input.nextInt();
         
        while(binary != 0){
            power10 = 1;
            while(i < counter) {
                power10 *= 10;
                i++;
                }
            i = 0;
            power2 = 1;
            while(i<counter) {
                power2 *= 2;
                i++;
                }
            i = 0;
            counter++;
        
            if(binary%power10 == power10/10){
                decimal += (power2/2);
                binary -= (power10/10);
            }
        }
        
        System.out.printf("Decimal equivalent: %d\n", decimal);

    }
}