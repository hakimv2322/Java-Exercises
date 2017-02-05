// Decode four-digit data.

import java.util.Scanner;
public class ch4Problem37B{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int number, decoded;
        int a, b, c, d;
        int[] set = {3,4,5,6,7,8,9,0,1,2};
        
        System.out.print("Enter four-digit number:");
        number = input.nextInt();
            
        d = number%10;
        c = ((number%100) - d)/10;
        b = ((number%1000) - (10*c) - d)/100;
        a = ((number%10000) - (100*b) - (10*c) - d)/1000;

        a = set[a];
        b = set[b];
        c = set[c];
        d = set[d];

        decoded = c*1000 + d*100 + a*10 + b;
        
        if(c != 0){
            System.out.printf("Decoded data: %d\n", decoded);
        }
        if((c == 0)&&(d != 0)){
            System.out.printf("Decoded data: 0%d\n", decoded);
        }
        if((c == 0)&&(d == 0)&&(a != 0)){
            System.out.printf("Decoded data: 00%d\n", decoded);
        }
        if((c == 0)&&(d == 0)&&(a == 0)&&(b != 0)){
            System.out.printf("Decoded data: 000%d\n", decoded);
        }
        if(decoded == 0){
            System.out.println("Decoded data: 0000");
        }
            
}
}