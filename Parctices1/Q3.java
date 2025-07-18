package Parctices;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Principle,time,rate");
        int p =sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.println("the value of simple interst is "+si);
        sc.close();

    }
}
