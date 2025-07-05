package Ch6_Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void pattern4(int n )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();

        for(int i=0; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print( j+ " " );
            }
            System.out.println(" ");
            sc.close();
        }
    }
    public static void main(String[] args) {
        pattern4(0);
    }
}
