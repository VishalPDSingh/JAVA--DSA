package Ch3_Conditional_Statements;

import java.util.Scanner;

public class ElseIfstate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18 && age<80)
        {
            System.out.println("You are adult");
        }

        else if(age>=13 && age<18)
        {
            System.out.println("Teeneger");
        }

        else
        {
            System.out.println("You are child");
        }
        sc.close();
    }
}
