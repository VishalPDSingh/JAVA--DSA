package Ch6_Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void pattern(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value n: ");
         n =sc.nextInt();

         for(int i=1; i<=n; i++)
         {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
         }
    }
    public static void main(String[] args) {
        pattern(0);
    }
}
