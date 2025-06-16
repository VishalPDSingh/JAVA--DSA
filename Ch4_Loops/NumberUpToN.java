package Ch4_Loops;

import java.util.Scanner;

public class NumberUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting value: ");
        int start = sc.nextInt();

        System.out.println("Enter the Ending Value: ");
        int ending = sc.nextInt();

        while (start <= ending) {
            System.out.println(start);
            start++;
        }
        sc.close();
    }
}
