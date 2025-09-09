/*W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 
*/
import java.util.Scanner;
public class Cs31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature:");
        int temp = sc.nextInt();
        System.out.println("enter to convert it into F/C"); 
        char c = sc.next().charAt(0);
        if (c=='f'|| c =='F'){
            int Fahrenheit = temp*9/5+32;
            System.out.println("fahrenheit is: "+ Fahrenheit);
        }else if( c=='c'|| c=='C'){
            int Celsius = (temp-32)*5/9;
            System.out.println("celsius is: "+Celsius);
        }

        
    }
}
