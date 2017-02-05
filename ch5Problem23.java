// Showing De Morgan's Laws to be true.

import java.util.Scanner;
public class ch5Problem23{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        boolean a,b,c,d;
        int m = 0, n = 0;
        
        System.out.println(
                "Showing De Morgan's Laws to be true.");
        
        System.out.println("Enter four boolean values:");
        
        System.out.print("a = ");
        a = input.nextBoolean();
        System.out.print("b = ");
        b = input.nextBoolean();
        System.out.print("c = ");
        c = input.nextBoolean();
        System.out.print("d = ");
        d = input.nextBoolean();
        
        if(!(a&&b) ==((!a)||(!b))){
            System.out.println(
                    "!(a&&b) ==((!a)||(!b))");
            m=1;
        }
        
        if(!(a||b) ==((!a)&&(!b))){
            System.out.println(
                    "!(a||b) ==((!a)&&(!b))");
            n=1;
        }
        
        if( m==1 && n==1 ){
            System.out.println(
                    "Therefore, De Morgan's Laws are valid.");
        }
        
    }
}