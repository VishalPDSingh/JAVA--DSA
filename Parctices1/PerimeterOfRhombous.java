package Parctices1;

import java.util.Scanner;

public class PerimeterOfRhombous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a =sc.nextInt();

        int perimeter = 4*a;
        System.out.println("Perimeter is: "+perimeter);
        sc.close();
    }
}
