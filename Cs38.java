//Write a Java program to input day number and print week day. 

import java.util.Scanner;
public class Cs38 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number between 1 and 7: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
        
            default:
            System.out.println("invalid number");
                    break;} 
    }
    
}
