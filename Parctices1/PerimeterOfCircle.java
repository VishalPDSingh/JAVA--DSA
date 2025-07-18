package Parctices;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        int r =sc.nextInt();

        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter of circle is "+perimeter);
        sc.close();
    }
}
