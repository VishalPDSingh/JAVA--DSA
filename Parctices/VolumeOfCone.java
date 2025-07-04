package Parctices;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of radius ");
        int r =sc.nextInt();

        System.out.println("Enter the value of height");
        int h =sc.nextInt();

        double volume = (Math.PI * r *r * h)/3;
        System.out.println("Volume is "+volume);
        sc.close();
    }
}
