package Parctices;

import java.util.Scanner;

public class ProAndAddDiff {
    public static int proSumDiff(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();

        int p = 1;
        int sum = 0;
        while (n>0) {
            int r = n%10;
            p = p*r;
            sum = sum+r;
            n/=10;
        }
        int diff = p-sum;
        sc.close();
        return diff;
    }
    public static void main(String[] args) {
        int sub = proSumDiff(0);
        System.out.println("Sub is "+sub);
    }
}
