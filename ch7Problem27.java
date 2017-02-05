// Finding all prime numbers less than or equal to n.

import java.util.Scanner;
public class ch7Problem27{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int number; // This is "n."
        int j;
        
        System.out.println("Finding all prime numbers less than or equal to n.");
        System.out.print("Enter n: ");
        number = input.nextInt();
        
        boolean primes[] = new boolean[number+1];
        
        for(int i=2; i<=number; i++){
            primes[i] = true;
        }
        
        for(int i=2; i<=number; i++){
            if(primes[i]){
                j=2;
                while( (i*j) <= number){
                    primes[i*j] = false;
                    j++;
                }
            }
        }
        
        for(int i=2; i<=number; i++){
            if(primes[i]){
                System.out.println(i);
            }
        }
        
    }
}