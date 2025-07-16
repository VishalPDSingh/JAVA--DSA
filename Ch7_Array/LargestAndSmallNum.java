package Ch7_Array;

public class LargestAndSmallNum {
    public static int largest(int arr[][])
    {
        int largestNum = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j]> largestNum)
                {
                    largestNum = arr[i][j];
                }
            }
        }
        return largestNum;
    }

    public static int smallest(int arr[][])
    {
        int smallestNum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if (smallestNum> arr[i][j]) {
                    smallestNum = arr[i][j];
                }
            }
        }
        return smallestNum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,11,12}};
        int largestNum = largest(arr);
        System.out.println(largestNum);

        int smallestNum =smallest(arr);
        System.out.println(smallestNum);
    }
}
