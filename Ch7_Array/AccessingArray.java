package Ch7_Array;

import java.util.Scanner;

public class AccessingArray {
    public static void main(String[] args) {
        
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i<marks.length; i++)
        {
            System.out.println("Enter the value of marks at index "+i);
            marks[i] = sc.nextInt();
            System.out.println("marks at index "+i+ " "+marks[i]);
        }
        sc.close();
    }
}
