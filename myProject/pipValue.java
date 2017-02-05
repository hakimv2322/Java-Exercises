// Investigating the Foreign Exchange Market: What is a PIP?

package myProject;
import java.util.Scanner;
public class pipValue {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Investigating the Foreign Exchange Market:"
                + " What is a PIP?");
        
        System.out.println();
        
        System.out.println("** This is a lesson to help understand what **"); 
        System.out.println("** the foreign exchange market is, how to   **");
        System.out.println("** interpret PIP values, what PIPs are, and **");
        System.out.println("** how to calculate profits or losses.      **");
        System.out.println("");
        System.out.println("** So what is foreign exchange?             **");
        System.out.println("** Foreign exchange, or Forex, is a         **");
        System.out.println("** market that deals with currency trading. **");
        System.out.println("** Similar to the stock market, the foreign **");
        System.out.println("** exchange market can have anyone          **");
        System.out.println("** participate. There are, however, brokers **");
        System.out.println("** that aid individuals in investment but   **");
        System.out.println("** charge a modest fee. (Be careful of      **");
        System.out.println("** the recent Forex scammers!)              **");
        System.out.println("");
        System.out.println("** Let's get started with just the basics   **");
        System.out.println("** of Forex. In particular, we should first **");
        System.out.println("** learn, more than anything, which         **");
        System.out.println("** calculations define profits and losses.  **");
        System.out.println("** To understand these calculations, we     **");
        System.out.println("** must learn what a PIP is.                **");
        System.out.println("");
        System.out.println("** PIP stands for \"Price Interest Point.\"   **");
        System.out.println("** It is the value of one's own money saved **");
        System.out.println("** when the ratio of the value of the       **");
        System.out.println("** currency to be traded for to the         **");
        System.out.println("** currency of his or her money increases   **");
        System.out.println("** by exactly one basis point. Here, the    **");
        System.out.println("** basis point refers to one one-thousandth **");
        System.out.println("** of said ratio. Let's give an example to  **");
        System.out.println("** demonstrate what a PIP value is.         **");
        System.out.println("");
        System.out.println("** A popular currency market is that of the **");
        System.out.println("** US dollar and euro. Suppose that the     **");
        System.out.println("** direct quote at this moment of USD/EUR   **");
        System.out.println("** is 0.7747. This means that US$1 will buy **");
        System.out.println("** you 0.7747 euros. Now, pretend that you  **");
        System.out.println("** wish to buy 10,000 euros with US         **");
        System.out.println("** dollars. This would cost US$12,908.22.   **");
        System.out.println("** If you are lucky (by exactly one unit),  **");
        System.out.println("** then maybe the direct quote will         **");
        System.out.println("** increase by one basis point to 0.7748.   **");
        System.out.println("** After that moment, you would only need   **");
        System.out.println("** to spend US$12,906.56. The amount you    **");
        System.out.println("** saved, US$1.66, is what is called the    **");
        System.out.println("** PIP value. Depending on whether you sold **");
        System.out.println("** or bought euros, you would have earned   **");
        System.out.println("** or lost money. Remember that Forex       **");
        System.out.println("** involves trading, as some people spend   **");
        System.out.println("** their professional lives doing this.     **");
        System.out.println("** There are risks involved, although       **");
        System.out.println("** losses are not as concrete as those of   **");
        System.out.println("** stock markets. Also note that the        **");
        System.out.println("** greater the value of one's investment,   **");
        System.out.println("** the greater the value of the PIP.        **");
        System.out.println("");
        System.out.println("** What is the importance of a PIP? It is a **");
        System.out.println("** unit of profit or loss. If you win x     **");
        System.out.println("** PIPs, then you've made x times PIP value **");
        System.out.println("** of profit in US dollars. Clearly, you    **");
        System.out.println("** don't want to lose PIPs when you trade.  **");
        System.out.println("");
        System.out.println("** You might have noticed that the Forex    **");
        System.out.println("** market is extremely similar to the stock **");
        System.out.println("** market. However, it's different. For     **");
        System.out.println("** one, stocks take days to increase or     **");
        System.out.println("** decrease in notable value. In currency   **");
        System.out.println("** trading, a direct quote can change five  **");
        System.out.println("** or ten PIPs within the half-hour. The    **");
        System.out.println("** Forex market is for the public, but      **");
        System.out.println("** really only used profitably by highly    **");
        System.out.println("** experienced financial professionals.     **");
        System.out.println("** Another difference is that banks have an **");
        System.out.println("** added control over the Forex market.     **");
        System.out.println("** Their loose-money or tight-money         **");
        System.out.println("** policies can drastically alter how a     **");
        System.out.println("** direct quote trend is typically          **");
        System.out.println("** predicted to be. If you invest too much  **");
        System.out.println("** and trade in very high PIP values,       **");
        System.out.println("** bankers can, quite literally, work the   **");
        System.out.println("** market around you. Great Forex traders   **");
        System.out.println("** know to stay \"under the radar\" while     **");
        System.out.println("** trading.                                 **");
        System.out.println("");
        System.out.println("** Okay, now for some calculations. Pursue  **");
        System.out.println("** if you would like to be taken through a  **");
        System.out.println("** hypothetical investment in the USD/EUR   **");
        System.out.println("** currency market.                         **");
        System.out.println("");
        System.out.println("");
        
        
        
        System.out.println("Enter how many US$ you would like to invest: ");
        double investment = input.nextDouble();
        
        System.out.println("Enter the USD/EUR direct quote. "
                + "If you do not know, enter -1:");
        double ratio = input.nextDouble();
        
        if(ratio != -1){
            
            double euros;
            double pip;
            
            euros = ratio*investment;
            
            pip = investment - euros/(ratio + 0.0001);
            
            System.out.println();
            System.out.printf("Your investment: $%,.2f\n",investment);
            System.out.printf("Euros you are purchasing: %,.2f\n",euros);
            System.out.printf("Your PIP value: $%,.2f\n",pip);
        }
        
        if(ratio == -1){
            
            double euros;
            double pip;
            double direct;
            
            System.out.println();
            System.out.println("** In that case, you "
                    + "will be entering a     **");
            System.out.println("** pair of numbers, "
                    + "USD and PIP value, that **");
            System.out.println("** you know is an "
                    + "accepted truth. Note      **");
            System.out.println("** investment in "
                    + "USD and PIP value hold a   **");
            System.out.println("** linear "
                    + "relation.                         **");
            System.out.println();
            
            System.out.println("Enter an amount in US$: ");
            double initialInv = input.nextDouble();
            
            System.out.println("Enter what you know is a"
                    + "corresponding PIP value, in US$: ");
            double initialPip = input.nextDouble();
            
            direct = 0.0001*((initialInv/initialPip) - 1);
            
            euros = direct*investment;
            
            pip = (initialPip/initialInv)*investment;
            
            System.out.println();
            System.out.printf("Your investment: $%,.2f\n",investment);
            System.out.printf("The USD/EUR direct quote: %,.4f\n",direct);
            System.out.printf("Euros you are purchasing: %,.2f\n",euros);
            System.out.printf("Your PIP value: $%,.2f\n",pip);
        }
        
        
        
        System.out.println("");
    }   
    
}
