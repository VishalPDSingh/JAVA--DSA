package Ch7_Array;

public class BinarySearch {
    public static int search(int arr[], int key)
    {
        int start = 0;
        int end = arr.length-1;

        //loop 
        while (start<=end) {
            int mid = start+end;
            if(arr[mid] == key)
            {
                return mid; // key found
            }else if (arr[mid]<key) {
                start = mid+1; //search in the right side
            }else
            {
                end = mid-1; //search in the left side
            }
        }
        return -1; // not found
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int key = 70;
        int index = search(arr, key);
        if(index == -1)
        {
            System.out.println("Not found");
        }else
        {
            System.out.println("Found at "+index);
        }
    }
}
