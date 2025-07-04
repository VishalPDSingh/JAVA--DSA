package Ch4_Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();

        while (n>0) {
            int rev = n%10; // Here it gives last didgit of number
            System.out.print(rev);
            n/=10; //Here it revmoves the last digit from number 
        }
        sc.close();
    }
}
