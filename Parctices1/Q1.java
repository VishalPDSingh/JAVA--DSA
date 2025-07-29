package Parctices1;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
