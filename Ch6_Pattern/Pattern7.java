package Ch6_Pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void pattern7(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n= sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        pattern7(0);
    }
}
