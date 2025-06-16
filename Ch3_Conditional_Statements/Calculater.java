package Ch3_Conditional_Statements;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        switch(operator)
        {
            case '+' :
            System.out.println(num1 + num2);
            break;

            case '-' :
            System.out.println(num1 - num2);
            break;

            case '*' :
            System.out.println(num1 * num2);
            break;

            case '/' :
            System.out.println(num1 / num2);
            break;

            case '%' :
            System.out.println(num1 % num2);
            break;

            default :
            System.out.println("Enter the valid op");
            sc.close();
        }
        
    }
}
