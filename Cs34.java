//W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides
import java.util.Scanner;
public class Cs34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first side of triangle:");
        int s1 = sc.nextInt();
        System.out.println("enter the second side of triangle:");
        int s2 = sc.nextInt();
        System.out.println("enter the third side of triangle:");
        int s3 = sc.nextInt();
        if ( s1!= s2 && s2 != s3 && s3 != s1){
          System.out.println("it is a scalene triangle ");
        }else if( s1 == s2 && s2  != s3 || s1 != s2 && s2 == s3 || s1!=s2 && s3 == s1){
            System.out.println("it is a isoscalene triangle ");
        }else if(s1 == s2 && s2 ==s3){
            System.out.println("it is a equilateral triangle ");

        }
        
    }
}
