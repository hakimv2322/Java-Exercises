// Finding the first n terms in the Fibonacci sequence.

import java.util.Scanner;
public class ch7Problem29{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.println(
                "Finding the first n terms in the Fibonacci sequence.");
        System.out.print("Enter n: ");
        number = input.nextInt();
        
        fibonacci(number);
        
    }
    
    public static void fibonacci( int term ){
        
        int sum=0;
        int fibs[] = new int[2];
        fibs[1] = 1;
        
        System.out.printf("%8s%21s\n", "Term", "Value");

        if(term>=1){
            System.out.printf("%8d%21d\n", 1, 0);
        }
        if(term>=2){
            System.out.printf("%8d%21d\n", 2, 1);
        }
        for(int i=3; i<=term; i++){
            sum = fibs[0]+fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = sum;
            System.out.printf("%8d%,21d\n",i,sum);
            }
        
    }
}