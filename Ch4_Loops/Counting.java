package Ch4_Loops;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of number: ");
        int num = sc.nextInt();
        while (num <= 100) {
            System.out.println(num);
            num++;
        }
        sc.close();
    }
}
