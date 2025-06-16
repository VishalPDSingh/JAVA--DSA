package Ch3_Conditional_Statements;

import java.util.Scanner;

public class PassExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        String type = ((marks >= 33)? "pass": "fails");
        System.out.println(type);
        sc.close();
    }
}
