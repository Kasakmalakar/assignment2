/*6. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1 */
import java.util.Scanner;
public class Cs6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input: ");
        int input = sc.nextInt();
        if ( input == 1)
        System.out.println("OUTPUT: 1");
        else if(input == -1)
        System.out.println("OUTPUT: 1");
        else
        System.out.println("invalid input");
        
    }
}
