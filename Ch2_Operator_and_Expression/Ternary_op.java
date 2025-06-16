package Ch2_Operator_and_Expression;

import java.util.Scanner;

public class Ternary_op {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = 2;
        int b = 6;
        int min = (a<b)? a:b;
        System.out.println(min);
        sc.close();
    }
}
