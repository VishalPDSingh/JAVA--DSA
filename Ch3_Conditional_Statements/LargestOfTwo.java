package Ch3_Conditional_Statements;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x and y");
        int x = sc.nextInt();
        int y =sc.nextInt();

        if(x>y)
        {
            System.out.println("X is the largest number "+x);
        }
        else{
            System.out.println("Y is largest number "+y);
        }
        sc.close();
    }
}
