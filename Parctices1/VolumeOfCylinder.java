package Parctices1;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of radius");
        int r =sc.nextInt();

        System.out.println("Enter the value of height");
        int h =sc.nextInt();

        double volume = Math.PI*r*r*h;
        System.out.println("Volume is "+volume);
        sc.close();
    }
}
