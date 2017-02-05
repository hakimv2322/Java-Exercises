//Here, we test the Invoice class.
package chapter3Problem13;
import java.util.Scanner;
public class InvoiceTest {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        String itemNumber, itemDescription;
        int itemQuantity;
        double itemPrice;
        
        Invoice item1 = new Invoice("208B", "bigThing", 10, 12.30);
        Invoice item2 = new Invoice("209A", "smallThing", 15, 17.29);
        
        System.out.print("Item 1");
        item1.myDisplay();
        
        System.out.print("Item 2");
        item2.myDisplay();
        
        System.out.printf(
                "Total cost for Item 1: $%.2f\n",
                item1.getInvoiceAmount());
        System.out.printf(
                "Total cost for Item 2: $%.2f\n",
                item2.getInvoiceAmount());
        
        System.out.println();
        
        System.out.print(
                "You may re-enter the item number for Item 1: ");
        itemNumber = input.nextLine();
        
        System.out.print(
                "You may re-enter the item description for Item 1: ");
        itemDescription = input.nextLine();
        
        System.out.print(
                "You may re-enter the quantity of Item 1: ");
        itemQuantity = input.nextInt();
        
        System.out.print(
                "You may re-enter the price of Item 1: ");
        itemPrice = input.nextDouble();
        
        item1.setPartNumber(itemNumber);
        item1.setPartDescription(itemDescription);
        item1.setQuantity(itemQuantity);
        item1.setPricePerItem(itemPrice);
        
        System.out.println();
        
        System.out.print("Item 1");
        item1.myDisplay();
        
        System.out.print("Item 2");
        item2.myDisplay();
        
        System.out.printf(
                "Total cost for Item 1: $%.2f\n",
                item1.getInvoiceAmount());
        System.out.printf(
                "Total cost for Item 2: $%.2f\n",
                item2.getInvoiceAmount());
        
        System.out.println();
        
    }
    
}
