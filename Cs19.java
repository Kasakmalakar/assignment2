/*WAP to exchange value to two variable with third variable and without third variable
 */
import java.util.Scanner;
public class Cs19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of first variable:");
        int v1 = sc.nextInt();
        System.out.println("enter the value of second variable:");
        int v2 = sc.nextInt();
        int v3;
        v3 = v1;
        v1 = v2;
        v2 = v3;
        System.out.println(" the value of variable first is: "+v1);
        System.out.println(" the value of second variable is: "+v2);
        //without using third variable
        
        }
}
