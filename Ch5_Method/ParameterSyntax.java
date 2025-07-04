package Ch5_Method;

import java.util.Scanner;

public class ParameterSyntax {
    
     public static void printhelloWorld()
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static int calculateSum(int num1, int num2)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: "+sum);
        return sum;
    }
    public static void main(String[] args) {
        printhelloWorld();
        calculateSum(0, 0);
        printhelloWorld();
        calculateSum(0, 0);
    }
}
