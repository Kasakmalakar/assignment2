/*3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. */
import java.util.Scanner;
public class Cs3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary: ");
        int salary = sc.nextInt();
        System.out.println("enter the year of service: ");
        int year = sc.nextInt();
        if (year>5){
            int bonus=(salary/100)*5;
            int net_amount=salary+bonus;
            System.out.println("the net amount is: "+net_amount);
        }else{
            System.out.println("the net salary is: "+salary);
        }

        
    }
}
