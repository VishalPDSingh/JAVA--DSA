package Ch2_Operator_and_Expression;

import java.util.Scanner;

public class Airthmetic_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        //Addition
        int add = x+y;
        System.out.println("Add is "+add);

        //subtraction
        int sub = x-y;
        System.out.println("Sub is "+sub);

        //multiplication
        int mul = x*y;
        System.out.println("mul is "+mul);

        //Divide
        int div = x/y;
        System.out.println("Divide is "+div);

        //Modulus
        int mod = x%y;
        System.out.println("mod is "+mod);
        sc.close();
    }
}
