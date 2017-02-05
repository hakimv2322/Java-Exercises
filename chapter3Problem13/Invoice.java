//This is the Invoice class.
package chapter3Problem13;

public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(
            String myNumber, String myDescription,
            int myQuantity, double myPrice
            ){
        
        partNumber=myNumber;
        partDescription=myDescription;
        if(myQuantity>=0){
            quantity=myQuantity;
        } else {quantity=0;}
        if(myPrice>=0){
            pricePerItem=myPrice;
        } else {pricePerItem=0.0;}
        
    }
    
    public void setPartNumber(String dummy){
        partNumber=dummy;
    }
    public String getPartNumber(){
        return partNumber;
    }
    
    public void setPartDescription(String dummy){
        partDescription=dummy;
    }
    public String getPartDescription(){
        return partDescription;
    }
    
    public void setQuantity(int dummy){
        if(dummy>=0){
            quantity=dummy;
        } else {quantity=0;}
    }
    public int getQuantity(){
        return quantity;
    }
    
    public void setPricePerItem(double dummy){
        if(dummy>=0){
            pricePerItem=dummy;
        } else {pricePerItem=0.0;}
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    public void myDisplay(){
        System.out.printf(
                ": %s\nDescription: %s\n"
                + "Quantity: %d\nPrice Per Item: $%.2f\n\n",
                partNumber,
                partDescription,
                quantity,
                pricePerItem);
    }
    
    public double getInvoiceAmount(){
        double invoiceAmount = pricePerItem*quantity;
        return invoiceAmount;
    }
    
}