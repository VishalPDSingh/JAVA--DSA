package Parctices1;

import java.util.Scanner;

public class AreaofEquilateral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of side");
        int a =sc.nextInt();

        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area is "+area);
        sc.close();
    }
}
