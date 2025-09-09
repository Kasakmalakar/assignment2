/*14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D
   */
import java.util.Scanner;
   public class Cs14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percentage: ");
        int percentage = sc.nextInt();
        if (percentage > 90){
            System.out.println("your grade is 'A'");
        }else if(percentage>80 && percentage<=90)
        System.out.println("your grade is 'B'");
        else if(percentage>=60 && percentage<=80)
        System.out.println("your grade is 'C'");
        else if( percentage<60)
        System.out.println("your grade is 'D'");
        
    }
}
