// WAP to find lowest number among four different number 

import java.util.Scanner;
public class Cs29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter fouth number: ");
        int num4 = sc.nextInt();
        if(num1<num2 && num1<num3 && num1<num4){
            System.out.println("number 1 is lowest");
        }else if(num2<num1 && num2<num3 && num2<num4){
            System.out.println("number 2 is lowest");
        }else if(num3<num1 && num3<num2 && num3<num3){
            System.out.println("number 3 is lowest");
         }else if(num4<num1 && num4<num2 && num4<num3){
            System.out.println("number 4 is lowest");
         }
        
    }
}
