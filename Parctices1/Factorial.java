package Parctices1;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        sc.close();
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
