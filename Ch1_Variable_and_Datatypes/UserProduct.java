package Ch1_Variable_and_Datatypes;

import java.util.Scanner;

public class UserProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();

        int pro = x*y;
        System.out.println(pro);
        sc.close();
    }
}
