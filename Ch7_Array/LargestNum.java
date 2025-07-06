package Ch7_Array;

public class LargestNum {
    public static int searchLarAndSmall(int num[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++)
        {
            if(num[i]>largest){
            largest = num[i];
            }
            if(num[i]<smallest)
            {
                smallest = num[i];
            }
        }
        System.out.println("Smallest is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {10,62,4,45,86,-8,12,30};
        System.out.println("Largest number is: "+searchLarAndSmall(num));
    }
}
