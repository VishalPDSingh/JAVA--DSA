package Parctices1;

import java.util.Scanner;

public class SumOfN {
    public static int sumUpToN(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum =sum+i;
        }
        sc.close();
        return sum;
    }
    public static void main(String[] args) {
        int SumIs = sumUpToN(0);
        System.out.println(SumIs);
    }
}
