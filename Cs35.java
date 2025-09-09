//W.A.P to check whether a charachter is an alphabet or not
import java.util.Scanner;
public class Cs35 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a character:");
         char c = sc.next().charAt(0);
         if ( c>=65 && c<=90 || c>=97 && c<=122){
            System.out.println("it is a alphabet character");
         }else 
         System.out.println("it is not a alphabet character");

        
    }
}
