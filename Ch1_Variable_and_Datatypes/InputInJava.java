package Ch1_Variable_and_Datatypes;

import java.util.*;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); //here, nextInt is used to capture the data or store the user data.
        System.out.println(input);
        sc.close();
    }
}
