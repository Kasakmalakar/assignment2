/*WAP to find greater among two number */
import java.util.Scanner;
public class Cs21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("firt number is greater");
        } else if (num2 > num1)
         System.out.println("second number is greater");

        
    }
}
