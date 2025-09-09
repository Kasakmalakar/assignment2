//Check given character is vowel or not using switch case
import java.util.Scanner;
public class Cs27 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the character:");
     char c = sc.next().charAt(0);
     switch(c){
        case 'a':
        System.out.println("it is a vowel");
        break;
        case 'e':
        System.out.println("it is a vowel");
        break;
        case 'i':
        System.out.println("it is a vowel");
        break;
        case 'o':
        System.out.println("it is a vowel");
        break;
        case 'u':
        System.out.println("it is a vowel");
        break;
        default:
        System.out.println("it is not vowel");
        break;
     }
        
    }
    
}
