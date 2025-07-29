package Parctices1;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of length and breadth");
        int length = sc.nextInt();
        int breadth =sc.nextInt();

        int area =length*breadth;
        System.out.println("Area is: "+area);
        sc.close();
    }
}
