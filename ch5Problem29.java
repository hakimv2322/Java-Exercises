// The Twelve Days of Christmas.

public class ch5Problem29{
    public static void main(String args[]) {

        System.out.println(
                "The Twelve Days of Christmas");
        System.out.println();
        
        for(int i=1; i<=12; i++){
            
            System.out.print("On the ");
            
            switch(i){
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default: System.out.println();
            }
            
            System.out.printf(
                    "day of Christmas\nMy true love sent to me:\n");
            
            switch(i){
                case 12:
                    System.out.println("Twelve Drummers Drumming");
                case 11:
                    System.out.println("Eleven Pipers Piping");
                case 10:
                    System.out.println("Ten Lords a-Leaping");
                case 9:
                    System.out.println("Nine Ladies Dancing");
                case 8:
                    System.out.println("Eight Maids a-Milking");
                case 7:
                    System.out.println("Seven Swans a-Swimming");
                case 6:
                    System.out.println("Six Geese a-Laying");
                case 5:
                    System.out.println("Five Golden Rings");
                case 4:
                    System.out.println("Four Calling Birds");
                case 3:
                    System.out.println("Three French Hens");
                case 2:
                    System.out.printf("Two Turtle Doves\nand ");
                case 1:
                    System.out.printf("A Partridge in a Pear Tree\n\n");
                default: System.out.println();
                
            }
            
        }
        
    }
}