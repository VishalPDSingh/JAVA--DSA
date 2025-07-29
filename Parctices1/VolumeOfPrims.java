package Parctices1;

import java.util.Scanner;

public class VolumeOfPrims {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Area of Base");
        int AreaOfBase = sc.nextInt();

        System.out.println("Enter the value of height ");
        int h =sc.nextInt();

        int volume = AreaOfBase*h;

        System.out.println("Volume is: "+volume);
        sc.close();
    }
}
