// WAP to check wheater number is positive or negative
import java.util.Scanner;
public class Cs24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =  sc.nextInt();
        if (num>0){
            System.out.println("it is positive");
        }else if(num<0){
            System.out.println("it is negative");
        }else System.out.println("number is neither positive nor negative");
        }
}
