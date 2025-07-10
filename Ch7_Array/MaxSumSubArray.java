package Ch7_Array;

public class MaxSumSubArray {

    public static int maxSumSub(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0; i<=arr.length-1; i++)
        {
            int start = i;
            for(int j=i; j<=arr.length-1; j++)
            {
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++)
                {
                    currSum+=arr[k];
                }
                if(currSum>maxSum)
                {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4};
        int maxSum = maxSumSub(arr);
        System.out.println(maxSum);
    }
}
