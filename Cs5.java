/*5.Take input of age of 3 people by user and determine oldest and youngest among them */
import java.util.Scanner;
public class Cs5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of first person");
        int p1 = sc.nextInt(); 
        System.out.println("enter the age of second person");
        int p2 = sc.nextInt();
        System.out.println("enter the age of third person");
        int p3 = sc.nextInt(); 
        if (p1>p2 && p1>p3) 
        System.out.println(" first person is oldest ");
        else if(p2>p1 && p2>p3)
        System.out.println(" second person is oldest ");
         else if(p3>p1 && p3>p2)
        System.out.println(" third person is oldest ");
        if (p1<p2 && p1<p3) 
        System.out.println(" first person is youngest ");
        else if(p2<p1 && p2<p3)
        System.out.println(" second person is youngest ");
         else if(p3<p1 && p3<p2)
        System.out.println(" third person is youngest ");
        
        
        
    }
}
