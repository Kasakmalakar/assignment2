/*26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F */
import java.util.Scanner;
    public class Cs41 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your percentage: "); 
      int percentage = sc.nextInt();
      if (percentage >= 90)
      System.out.println("your grade is A");
      else if (percentage >= 80 && percentage< 90)
      System.out.println("your grade is B");
      else  if (percentage >= 70 && percentage< 80)
      System.out.println("your grade is ");
      else  if (percentage >= 60 && percentage< 70)
      System.out.println("your grade is D");
      else if (percentage >= 40 && percentage< 60)
      System.out.println("your grade is E");
      else if (percentage<40)
      System.out.println(" your grade is F");
      else 
      System.out.println("can't be determine");
        
    }
}
