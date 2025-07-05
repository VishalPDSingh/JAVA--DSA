package Ch6_Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void pattern1(int n )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();

        for(int i = 0; i<=n; i++)
        {
            System.out.println("*****");
        }
        sc.close();
    }
    public static void main(String[] args) {
        pattern1(0);
    }
}
