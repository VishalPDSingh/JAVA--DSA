package Ch3_Conditional_Statements;

import java.util.Scanner;

public class OddEvenIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n");
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
