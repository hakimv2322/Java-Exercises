// Input a decimal integer and output the base-2 equivalent.
// Just swap all each "10" and "2" in ch4Problem31.java! =)

import java.util.Scanner;
public class ch4Problem31VV{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int binary = 0, decimal  = 0;
        int power2 = 0, power10 = 0;
        int counter = 1, i = 0;
        
        System.out.print("Enter a base-10 integer: ");
        binary = input.nextInt();
         
        while(binary != 0){
            power2 = 1;
            while(i < counter) {
                power2 *= 2;
                i++;
                }
            i = 0;
            power10 = 1;
            while(i<counter) {
                power10 *= 10;
                i++;
                }
            i = 0;
            counter++;
        
            if(binary%power2 == power2/2){
                decimal += (power10/10);
                binary -= (power2/2);
            }
        }
        
        System.out.printf("Binary equivalent: %d\n", decimal);

    }
}