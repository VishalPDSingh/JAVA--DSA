package Ch7_Array;

import java.util.Scanner;

public class Array2d {
    // method to find target elements 
    public static boolean search(int arr[][], int target)
    {
        for(int i =0; i<arr.length; i++)
        {
            for(int j =0; j<arr[0].length; j++)
            {
                if(arr[i][j] == target)
                {
                    System.out.print("found at cell ("+i+" "+j+ ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        //number of rows and colums
         int n =3;
         int m= 4;
        // 2d array
        int arr[][] = new int[n][m];
        int target = 5;
        System.out.println(arr.length); // number of rows
        System.out.println(arr[0].length); //number of colums


        // taking input of the array
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        // printing the 2d array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean index = search(arr, target);
        System.out.println(index);
        sc.close();
    }
}
