/*15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%			 */
import java.util.Scanner;
     public class Cs15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost of bike: ");
        int cost = sc.nextInt();
        int tax;
        if (cost >100000){
          tax = cost/100 *15;
          System.out.println("the tax paid is: "+tax);}
          else if (cost >50000 && cost<= 100000){
          tax = cost/100 *10;
          System.out.println("the tax paid is: "+tax);}
          else if (cost <=50000){
          tax = cost/100 *5;
          System.out.println("the tax paid is: "+tax);
         }
        
    }
    
}
