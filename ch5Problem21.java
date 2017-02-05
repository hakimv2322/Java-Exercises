// Finding all Pythagorean Triples less than n.

import java.util.Scanner;
public class ch5Problem21{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        int number;
                
        System.out.println(
                "Finding all Pythagorean Triples less than n.");
        System.out.print(
                "Enter n: ");
        number = input.nextInt();
        
        System.out.printf(
                "All Pythagorean triples less than %d:\n", number);
        
        for(int i=0; i<=number; i++){
            a = i;
            for(int j=(i+1); j<=number; j++){
                b = j;
                for(int k=(j+1); k<=number; k++){
                    
                    c = k;
                    if((a*a)+(b*b)==(c*c)){
                        System.out.printf(
                                "(%d, %d, %d)\n",a,b,c);
                    }
                    
                }
                
            }
            
        }
        
    }
}