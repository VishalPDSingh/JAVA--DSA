package Ch7_Array;

public class SmallestLetter {
    public static char gratestLetter(char arr[], char target )
    {
          int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            // Here, We check ceiling of number is equal.
            int mid = start+(end-start)/2;
            if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start%arr.length];
    }
    public static void main(String[] args) {
        char str [] = {'c','d','f','l'};
        char target = 'o';
        char index = gratestLetter(str, target);
        System.out.println(index);
        System.out.println('a'>'b');
    }
}
