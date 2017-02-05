// Determines whether a right triangle can be formed with three integers.

import java.util.Scanner;
public class ch4Problem36{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("Enter three nonzero integers.");
        System.out.print("First integer: ");
        a = input.nextInt();
        System.out.print("Second integer: ");
        b = input.nextInt();
        System.out.print("Third integer: ");
        c = input.nextInt();
        
        if(((a*a) + (b*b) == (c*c))||((b*b) + (c*c) == (a*a))
                ||((c*c) + (a*a) == (b*b))){
            System.out.println(
                    "A right triangle can be made with these integers.");
        } else {
            System.out.println(
                    "A right triangle cannot be made with these integers.");
        }
    }
}