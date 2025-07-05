package Ch6_Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void pattern3(int n )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();

        for(int i= 0; i<=n; i++)
        {
            for(int j=0; j<=n-i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    public static void main(String[] args) {
        pattern3(0);
    }
}
