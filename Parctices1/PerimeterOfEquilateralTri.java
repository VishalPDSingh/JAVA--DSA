package Parctices1;

import java.util.Scanner;

public class PerimeterOfEquilateralTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of side");
        int a =sc.nextInt();

        int perimeter = 3*a;
        System.out.println("Perimeter is: "+perimeter);
        sc.close();
    }
}
