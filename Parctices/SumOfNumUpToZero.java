package Parctices;

import java.util.Scanner;

public class SumOfNumUpToZero {
    public static int sumUpToZero(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum =0;
        while(true)
        {
            System.out.print("Enter the value of n: ");
            n =sc.nextInt();
            System.out.println(n);
            if(n==0)
            {
                break;
            }
            sum+=n;
        }
        sc.close();
        return sum;
    }
    public static void main(String[] args) {
        int sum = sumUpToZero(0);
        System.out.println("Sum is: "+sum);
    }
}
