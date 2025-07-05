package Ch6_Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void pattern6(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();

        for(int i=0; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        pattern6(0);
    }
}
