/*  WAP to calculate area of rectangle*/
import java.util.Scanner;
public class Cs17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of rectangle:");
        int length = sc.nextInt();
        System.out.println(" enter the breadth of rectangle:");
        int breadth = sc.nextInt();
        int area;
        area = length*breadth;
        System.out.println("area of rectangle is: "+area);
        
        
    }
}
