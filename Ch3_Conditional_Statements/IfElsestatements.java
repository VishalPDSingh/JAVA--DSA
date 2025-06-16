package Ch3_Conditional_Statements;

import java.util.Scanner;

public class IfElsestatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        
        if(age >= 18 && age <= 80)
        {
            System.out.println("your are adult, you can vote");
        }

        if(age >= 13 && age < 18)
        {
            System.out.println("teenger");
        }
        
        else
        {
            System.out.println("you are not adult");
        }
        sc.close();
    }
}
