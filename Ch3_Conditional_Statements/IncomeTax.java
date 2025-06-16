package Ch3_Conditional_Statements;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your income");
        int income =sc.nextInt();

        if(income <= 500000)
        {
            System.out.println("Zero percent tax");
        }

        else if(income > 500000 && income < 1000000)
        {
            System.out.println("10% tax");
        }

        else
        {
            System.out.println("30% tax");
        }
        sc.close();
    }
}
