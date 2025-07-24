package Ch10_Recursion;

public class SumOfN {
    public static int sumN(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        int sumN_1 = sumN(n-1);
        int sum = n+ sumN_1;
        return sum;
    }
    public static void main(String[] args) {
        
        int x = 5;
        System.out.println(sumN(x));
    }
}
