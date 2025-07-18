package Parctices;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x and y");
        int x =sc.nextInt();
        int y =sc.nextInt();

        System.out.println("Enter the value of opretor(+,-,*,/,%)");
        char ch = sc.next().charAt(0);

        if(ch=='+')
        {
            int sum = x+y;
            System.out.println("Sum is: "+sum);
        }
        if(ch=='-')
        {
            int sub = x+y;
            System.out.println("Sub is: "+sub);
        }
        if(ch=='*')
        {
            int mul = x*y;
            System.out.println("mul is: "+mul);
        }
        if(ch=='/')
        {
            int div = x/y;
            System.out.println("Sum is: "+div);
        }
        if(ch=='%')
        {
            int mod = x%y;
            System.out.println("Sum is: "+mod);
        }
        sc.close();
    }
}
