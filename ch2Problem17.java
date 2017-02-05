// Exercise 2.17
// Find the sum, average, product, smallest and largest of three integers.

import java.util.Scanner;
public class ch2Problem17 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        int z;
        int sum;
        int product;
        int average;
        
        System.out.print("Enter first integer:");
        x = input.nextInt();
        
        System.out.print("Enter second integer:");
        y = input.nextInt();
        
        System.out.print("Enter third integer:");
        z = input.nextInt();
        
        sum = x + y + z;
        product = x*y*z;
        average = (sum)/3;
        
        System.out.printf("Sum is %d.\n", sum);
        System.out.printf("Product is %d.\n", product);
        System.out.printf("Average is %d.\n", average);
        
        if(x>y && x>z)
            System.out.printf("%d is the largest.\n",x);
        
        if(y>x && y>z)
            System.out.printf("%d is the largest.\n",y);
        
        if(z>y && z>x)
            System.out.printf("%d is the largest.\n",z);
        
        if(x<y && x<z)
            System.out.printf("%d is the smallest.\n",x);
        
        if(y<x && y<z)
            System.out.printf("%d is the smallest.\n",y);
        
        if(z<y && z<x)
            System.out.printf("%d is the smallest.\n",z);
        
    }
}
