package Ch8_SortinAlgo;

public class SelectionSort {
    public static void sort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int min = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] =arr[i];
            arr[i] = temp;

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
        int arr[] = {5,4,3,1,2};
        sort(arr);
        display(arr);
    }
}
