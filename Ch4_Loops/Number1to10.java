package Ch4_Loops;

import java.util.Scanner;

public class Number1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while(num <= 10)
        {
            System.out.println(num);
            num++;
        }
        sc.close();
    }
}
