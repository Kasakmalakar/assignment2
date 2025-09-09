//Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180
import java.util.Scanner;
public class Cs36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first angle: ");
        int angle1 = sc.nextInt();
         System.out.println("enter the second angle: ");
        int angle2 = sc.nextInt();
         System.out.println("enter the third angle: ");
        int angle3 = sc.nextInt();
        int sum = angle1+angle2+angle3;
        if (sum == 180)
        System.out.println("it is a valid triangle");
        else
        System.out.println("it is not a valid triangle");
        
    }
}
