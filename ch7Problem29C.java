// Finding the first n terms in the Fibonacci sequence.

import java.util.Scanner;
public class ch7Problem29C{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        double number;
        
        System.out.println(
                "Finding the first n terms in the Fibonacci sequence.");
        System.out.print("Enter n: ");
        number = input.nextDouble();
        
        fibonacci(number);
        
    }
    
    public static void fibonacci( double term ){
        
        double sum=0;
        double fibs[] = new double[2];
        fibs[1] = 1;
        
        System.out.printf("%8s%62s\n", "Term", "Value");

        if(term>=1){
            System.out.printf("%8d%62f\n", 1, 0.000000);
        }
        if(term>=2){
            System.out.printf("%8d%62f\n", 2, 1.000000);
        }
        for(int i=3; i<=term; i++){
            sum = fibs[0]+fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = sum;
            System.out.printf("%8d %,61f\n",i,sum);
            }
        
    }
}