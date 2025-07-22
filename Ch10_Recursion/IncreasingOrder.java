package Ch10_Recursion;

public class IncreasingOrder {
    public static void nums(int x)
    {
        // if(x == 10)
        // {
        //     System.out.println(x);
        //     return;
        // }
        // else
        // {
        //     System.out.println(x);
        //     nums(x+1);
        // }

        if(x == 1)
        {
            System.out.println(x+" ");
            return;
        }
        else
        {
            nums(x-1);
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        nums(n);
       // nums(n);
    }
}
