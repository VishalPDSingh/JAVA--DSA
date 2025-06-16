package Ch3_Conditional_Statements;

import java.util.Scanner;

public class Ternary_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        String types = ((n%2==0)?"even":"odd");
        System.out.println(types);
        sc.close();
    }
}
