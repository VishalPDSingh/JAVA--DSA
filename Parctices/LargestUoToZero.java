package Parctices;

import java.util.Scanner;

public class LargestUoToZero {
    public static int largest(int n)
    {
        Scanner sc=new Scanner(System.in);
         int largest = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter the value of n: ");
            n =sc.nextInt();
            if(n==0)
            {
                break;
            }
            if(n>largest)
            {
                largest = n;
            }
        }
        sc.close();
        return largest;
    }
    public static void main(String[] args) {
        int largestNum = largest(0);
        System.out.println(largestNum);
    }
}
