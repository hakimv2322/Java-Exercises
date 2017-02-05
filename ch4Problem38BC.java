// Compute e raised to some power.

import java.util.Scanner;
public class ch4Problem38BC{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        double number = 0, denominator = 1, numerator = 1;
        double counter = 1, dummy = 1, stopper = 0;
        double approximation = 1, i = 0;
        
        System.out.print("Enter a real number: ");
        number = input.nextDouble();
        System.out.println();
        
        while(stopper == 0){
            
            numerator = 1;
            while(i < counter) {
                numerator *= number;
                i++;
                }
            i = 0;
            
            dummy = counter;
            denominator = 1;
            while(dummy > 1){
                denominator *= (dummy--);
            }
            
            approximation += (numerator/denominator);
            counter++;
            
            if(
                    (numerator/denominator)
                    <
                    0.00000000000000000001
                    ){
                stopper = 1;
            }            
        }
        System.out.printf(
                "This is e raised to the power of that number:\n%.13f\n",
                approximation);
}
}