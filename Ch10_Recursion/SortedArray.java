package Ch10_Recursion;

public class SortedArray {
    public static boolean isSorted(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return  isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,10,4,5};
        System.out.println(isSorted(num, 0));
    }
}
