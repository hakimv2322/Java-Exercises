// Input the miles driven and gallons used for each drive.
// Calculate the miles per gallon for each drive.
// Calculate the miles per gallon of all drives.

import java.util.Scanner;
public class ch4Problem17{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int miles = 0, gallons = 0, totalmiles = 0, totalgallons = 0;
        double mpg, totalmpg;
        
        System.out.printf(
                "Continue reading to receive data on your vehicle's MPG!\n\n");
        System.out.print(
                "Enter the miles driven on this run. Enter -1 to finish: ");
        miles = input.nextInt();
        totalmiles += miles;
        
        if (miles == -1){
            System.out.println(
                    "No information was entered. You have finished.");
        }
        else{
            System.out.print(
                    "Enter the gallons used on this run:");
            gallons = input.nextInt();
            totalgallons += gallons;
            mpg = (double) (miles)/(gallons);
            totalmpg = (double) (totalmiles)/(totalgallons);
            System.out.printf(
                    "MPG for this run is %.3f.\n", mpg);
            System.out.printf(
                    "MPG for all runs to this point is %.3f.\n",totalmpg);
            while(miles != -1){
                System.out.print(
                        "Enter the miles driven on this run. Enter -1 to finish: ");
                miles = input.nextInt();
                totalmiles += miles;
                if (miles == -1){
            System.out.println(
                    "You have finished.");
            System.out.printf(
                    "MPG for all runs is %.3f.\n", totalmpg);
        }
             else{
            System.out.print(
                    "Enter the gallons used on this run:");
            gallons = input.nextInt();
            totalgallons += gallons;   
            mpg = (double) (miles)/(gallons);
            totalmpg = (double) (totalmiles)/(totalgallons);
            System.out.printf(
                    "MPG for this run is %.3f.\n", mpg);
            System.out.printf(
                    "MPG for all runs to this point is %.3f.\n",totalmpg);
            }
            }
        }
}
}