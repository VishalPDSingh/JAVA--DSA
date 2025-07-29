package Parctices1;

import java.util.Scanner;
//Input currency in rupees and output in USD.
public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of rupees");
        int rupees = sc.nextInt();

        int USD = (int)(rupees*0.0119);
        System.out.println("The usd is: "+USD);
        sc.close();
    }
}
