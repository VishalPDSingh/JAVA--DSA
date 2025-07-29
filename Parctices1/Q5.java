package Parctices1;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x and y");
        int x =sc.nextInt();
        int y =sc.nextInt();

        if(x>y)
        {
            System.out.println("x is the largest number "+x);
        }
        else
        {
            System.out.println("y is the largest number "+y);
        }
        sc.close();
    }
}
