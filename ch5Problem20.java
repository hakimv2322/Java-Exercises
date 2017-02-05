// Listing Pi term by term.

import java.util.Scanner;
public class ch5Problem20{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        double sum = 0;
        int number;
                
        System.out.println("Listing Pi term by term.");
        System.out.print(
                "Enter the number of terms you'd like to have listed: ");
        number = input.nextInt();
        
        System.out.printf(
                "%5s%20s\n","Terms","Estimation of Pi");
        
        for(int i=0; i < number; i++){
            
            sum += 4*(Math.pow(-1,i)/(2*i + 1)) ;
            System.out.printf(
                    "%5d%20f\n",i+1,sum);
            
        }
    }
}