package Parctices1;

import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for(int i =2; i<=n; i++)
        {
            if(n%i ==0)
            System.out.println("Factor is "+i);
        }
        sc.close();
    }
}
