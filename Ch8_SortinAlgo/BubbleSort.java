package Ch8_SortinAlgo;

public class BubbleSort {
    public static void sorting(int arr[])
    {
        // number of turn
        for(int turn=0; turn<arr.length-1; turn++)
        {
          //  System.out.println(arr[turn]);
            for(int j=0; j<arr.length-turn-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // Swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sorting(arr);
        display(arr);
    }
}
