package Ch1_Variable_and_Datatypes;

import java.util.Scanner;

public class AeraOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int r = sc.nextInt();
        int area =(int) Math.PI*r*r;
        System.out.println(area);
        sc.close();
    }
}
