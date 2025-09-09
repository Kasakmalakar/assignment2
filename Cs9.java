//9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
public class Cs9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character of alphabet: ");
        char c = sc.next().charAt(0);
        if (c >65 && c<90)
        System.out.println("chatacter is in upper case");
        else if ( c>97 && c<122)
        System.out.println("chatacter is in lower case");
        else 
        System.out.println("invalid character");
        
    }
}
