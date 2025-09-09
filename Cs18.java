/*  WAP to calculate the percentage of students*/
import java.util.Scanner;
public class Cs18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks obtained out of 500: ");
        int marks = sc.nextInt();
        int percentage= marks*100/500;
        System.out.println("your percentage is: "+percentage);
        
    }
    
}
