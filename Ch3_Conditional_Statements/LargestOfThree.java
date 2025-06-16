package Ch3_Conditional_Statements;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x,y and z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x>y && x>z)
        {
            System.out.println("X is largest number "+x);
        }

        else if(y>z)
        {
            System.out.println("Y is the largest number "+y);
        }

        else
        {
            System.out.println("Z is the largest number "+z);
        }
        sc.close();
    }
}
