//Write a Java program to calculate profit or loss
import java.util.Scanner;
public class Cs40 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the amount of purchase:");
     int purchase = sc.nextInt();
     System.out.println("enter the amount of sell: "); 
     int sell = sc.nextInt();
     if (purchase< sell){
        System.out.println("there is profit of:"+(sell-purchase));
     }else if(purchase> sell){
        System.out.println("there is loss of: "+(purchase-sell));
     }else
     System.out.println("can't be determine");

        
    }
    
}
