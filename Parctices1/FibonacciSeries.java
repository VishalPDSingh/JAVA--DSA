package Parctices;

import java.util.Scanner;

// Fibonacci Serise is a sequance of number where each number is the sum of 
//the two preceding ones, typically starting with 0 and 1 
public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of term");
        int n =sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+ "," +b+" , ");

        for(int i = 2; i<=n ; i++)
        {
            int c = a+b;
            System.out.print(c+ " , ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
