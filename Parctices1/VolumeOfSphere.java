package Parctices1;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of radius: ");
        int r =sc.nextInt();

        double volume = (Math.PI*r*r*r)*4/3;
        System.out.println("Volume is "+volume);
        sc.close();
    }
}
