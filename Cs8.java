//8. Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly
import java.util.Scanner;
public class Cs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the medical cause (Y/N): ");
        char medical = sc.next().charAt(0);
        //System.out.println(medical);
        if (medical == 'Y')
        System.out.println("student is allowed to sit");
        else if( medical =='N')
        System.out.println("student is  not allowed to sit");
        else 
        System.out.println("invalid character");

        
    }
}
