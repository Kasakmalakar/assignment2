//WAP to check given year is a leap year or not 

import java.util.Scanner;

public class Cs30 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        if (year %100 == 0){
            if (year %400 == 0){
                System.out.println("year is a leap year");
            }else System.out.println(" the year is  not leap year");
        }else if (year%4 == 0 )
        System.out.println("the year is leap year");
        else 
        System.out.println(" the year is  not leap year");   
    }
}
