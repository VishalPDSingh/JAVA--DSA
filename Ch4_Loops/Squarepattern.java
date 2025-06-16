package Ch4_Loops;

import java.util.Scanner;

public class Squarepattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of lines");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println("****");
        }
        sc.close();
    }
}
