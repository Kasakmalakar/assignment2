// 1. Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;
class Cs1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int lenght= sc.nextInt();
        System.out.println("enter the breadth");
        int breadth = sc.nextInt();
        if ( lenght == breadth)
        System.out.println("it is square");
        else 
        System.out.println("it is rectangle");


    
    }
}