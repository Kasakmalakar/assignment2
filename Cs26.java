// Find even odd using switch case 
import java.util.Scanner;
public class Cs26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        switch (num%2) {
            case 0:
            System.out.println("number is even");
            break;
            case 1:
            System.out.println("number is odd");
            break;
          default:
            System.out.println("number is neither even nor odd");
                break;
        }
        
    }
    
}
