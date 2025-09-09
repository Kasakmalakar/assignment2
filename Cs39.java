// Write a Java program to count total number of notes in given amount. 

import java.util.Scanner;
public class Cs39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in terms you have  100 rs note: ");
        int amount = sc.nextInt();
        int notes  = amount/100;
        System.out.println("number of notes are: "+notes);


        
    }
}
