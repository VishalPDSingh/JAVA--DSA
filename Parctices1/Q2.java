package Parctices;

import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome to my home "+name);
        sc.close();
    }
}
