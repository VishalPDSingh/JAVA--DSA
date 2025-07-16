package Ch8_SortinAlgo;

public class SelectionSort {
    public static void sort(int arr[])
    {
        for(int turns=0; turns<arr.length-1; turns++)
        {
            int max = turns;
            
                for(int i=turns+1; i<arr.length; i++)
                {
                    if(arr[max]<arr[i])
                    {
                        max = i;
                    }
                }
                int temp = arr[turns];
                arr[turns] = arr[max];
                arr[max] = temp;
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
