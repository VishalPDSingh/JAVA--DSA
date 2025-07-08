package Ch7_Array;

public class Reverse {
    public static void reverseArray(int arr[])
    {
        int start =0;
        int end = arr.length-1;

        //loop
        while (start<end) {
            //Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};

        reverseArray(arr);
        for(int i =0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
