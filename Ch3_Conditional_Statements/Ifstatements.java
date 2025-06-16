package Ch3_Conditional_Statements;

import java.util.Scanner;

public class Ifstatements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("your are a adult");
            System.out.println("Now you can go to colllege ");
            System.out.println("You can drived a car ");
            sc.close();
        }
    }
}
