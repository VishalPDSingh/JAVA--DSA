package Parctices;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of base and height");
        int b =sc.nextInt();
        int h= sc.nextInt();

        double area =(b*h)/2;

        System.out.println("Area is: "+area);
        sc.close();
    }
}
