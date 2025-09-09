//Program to perform arithmetic operation using switch case
import java.util.Scanner;
public class Cs28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the arithmetic operand 1");
        int op1 = sc.nextInt();
        System.out.println("Enter the arithmetic operand 2");
        int op2 = sc.nextInt();
        System.out.println("Enter the arithmetic operater");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
            int add = op1+op2;
            System.out.println("addition is: "+add);
            break;
            case '-':
            int sub = op1 - op2;
            System.out.println("subraction is " + sub);
            break;
            case '*':
            System.out.println("multiplication is: "+(op1*op2));
            break;
            case '/':
            System.out.println("division is: "+(op1/op2));
            break;
            default:
            System.out.println("invalid operator");
            break;
        }
        
    }
}
