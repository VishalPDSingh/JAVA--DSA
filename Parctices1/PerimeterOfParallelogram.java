package Parctices1;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        int a =sc.nextInt();
        int b =sc.nextInt();

        int perimeter = 2*(a+b);
        System.out.println("perimeter is: "+perimeter);
        sc.close();
    }
}
