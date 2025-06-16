package Ch2_Operator_and_Expression;

import java.util.Scanner;

public class Logical_op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a>b && a>c);
        System.out.println(a<b && a<c);
        System.out.println(a>b || a>c);
        System.out.println(a<b || a<c);
        System.out.println(!(a<b));
       sc.close();
    }
}
