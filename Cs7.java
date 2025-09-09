/*7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. */
import java.util.Scanner;
public class Cs7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of classes held:");
        int class_held = sc.nextInt();
         System.out.println("enter the number of classes attended:");
        int class_attend = sc.nextInt();
        int percentage= class_attend * 100/class_held;
        System.out.println("attandance percentile: "+percentage);
        if ( percentage< 75)
        System.out.println("student is not allowed to sit in exam");
        else if(percentage>75)
        System.out.println("student is  allowed to sit in exam");


        
    }
}
