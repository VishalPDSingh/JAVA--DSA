package Ch7_Array;

public class CeilingAndFloorNum {
    public static int ceilingOfNum(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        // if the target number is largest than last index
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while (start<=end) {
            // Here, We check ceiling of number is equal.
            int mid =(start+end)/2;
            if(arr[mid]== target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return start;
    }
    public static int FloorOfNum(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            // Here, We check floor of number is equal.
            int mid =(start+end)/2;
            if(arr[mid]== target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 17;
        int index = ceilingOfNum(arr, target);
        System.out.println("the ceiling of number is "+index);

        int index1 = FloorOfNum(arr, target);
        System.out.println("Floor of the number at the index: "+index1);
    }
}
