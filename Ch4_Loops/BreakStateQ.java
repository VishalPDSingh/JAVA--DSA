package Ch4_Loops;

import java.util.Scanner;

public class BreakStateQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("Enter the number ");
            int n =sc.nextInt();

            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}
