package Ch7_Array;

public class PreFixArraySum {
    public static int maxSubSum(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        //prefix Array
        int prefixArr[] = new int[arr.length];
        prefixArr[0] = arr[0];
        for(int i = 1; i<prefixArr.length; i++)
        {
            prefixArr[i] = prefixArr[i-1] + arr[i];
            System.out.println(prefixArr[i]);
        }
        
        for(int i=0; i<=arr.length-1; i++)
        {
            int start = i;
            for(int j=i; j<=arr.length-1; j++)
            {
                int end = j;
                if(start==0)
                {
                    currSum = prefixArr[end];    
                }else{
                currSum = prefixArr[end]-prefixArr[start-1];
                }
            }
            if(currSum>maxSum)
            {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4};
       int max= maxSubSum(arr);
       System.out.println(max);
    }
}
