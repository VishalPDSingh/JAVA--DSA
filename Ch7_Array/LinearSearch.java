package Ch7_Array;

import java.util.Scanner;


public class LinearSearch {

    //Method to search the elements in the array
    public static int linearSearch(int num[], int key)
    {
        for(int i=0; i<num.length; i++)
        {
            if(num[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Linear Search: Searching the elements is the array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int num[] = new int[n];

        //loop for taking values at each index of array
        for(int i=0; i<num.length; i++)
        {
            System.out.println("Enter the at index: "+i);
            num[i] = sc.nextInt();
        }
        // for printing the value of array
        for(int j=0; j<num.length; j++)
        {
            System.out.print(num[j]+ " ");
        }
        System.out.println();


        System.out.println("Enter the value to search: ");
        int key = sc.nextInt();

        //Method calling
        int index = linearSearch(num, key);
        if(index==-1)
        {
            System.out.println("Elements is not found");
        }
        else{
            System.out.println("Elements at: "+index);
        }
        sc.close();
    }
}
