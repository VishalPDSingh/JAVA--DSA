package Ch4_Loops;

import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;

        while (i<=n) {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
}
