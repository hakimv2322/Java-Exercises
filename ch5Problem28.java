// Manually creating a continue statement.

public class ch5Problem28{
    public static void main(String args[]) {

        System.out.println(
                "Manually creating a continue statement.");
        for(int i=0; i<10; i++){
            if(i != 4){
                System.out.printf("%d ",i+1);
            }
        }
        System.out.println();
        
    }
}