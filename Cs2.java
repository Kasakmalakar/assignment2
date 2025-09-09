/*2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user. */
import java.util.Scanner;
public class Cs2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the quantity of items");
        int quantity = sc.nextInt();
        int cost= quantity*100;
        if (cost>1000){
            int discount=(cost/100)*10;
            int total_cost= cost - discount;
            System.out.println("the total cost is: "+total_cost);
        }else{
            System.out.println("the total cost is "+cost);
        }

        
    }
}
