// Encrypt four-digit data.

import java.util.Scanner;
public class ch4Problem37A{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int number, encrypted;
        int a, b, c, d;
        
        System.out.print("Enter four-digit number:");
        number = input.nextInt();
            
        d = number%10;
        c = ((number%100) - d)/10;
        b = ((number%1000) - (10*c) - d)/100;
        a = ((number%10000) - (100*b) - (10*c) - d)/1000;

        a = (a+7)%10;
        b = (b+7)%10;
        c = (c+7)%10;
        d = (d+7)%10;

        encrypted = c*1000 + d*100 + a*10 + b;
        
        if(c != 0){
            System.out.printf("Encrypted data: %d\n", encrypted);
        }
        if((c == 0)&&(d != 0)){
            System.out.printf("Encrypted data: 0%d\n", encrypted);
        }
        if((c == 0)&&(d == 0)&&(a != 0)){
            System.out.printf("Encrypted data: 00%d\n", encrypted);
        }
        if((c == 0)&&(d == 0)&&(a == 0)&&(b != 0)){
            System.out.printf("Encrypted data: 000%d\n", encrypted);
        }
        if(encrypted == 0){
            System.out.println("Encrypted data: 0000");
        }
            
}
}