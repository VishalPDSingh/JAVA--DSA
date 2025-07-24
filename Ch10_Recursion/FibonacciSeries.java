package Ch10_Recursion;

public class FibonacciSeries {
    public static int fibonacciseries(int n)
    {
       if(n==0 || n==1)
       {
        return n;
       }
        int fibN_1 = fibonacciseries(n-1);
        int fib_2 = fibonacciseries(n-2);
        int fib_N = fibN_1 + fib_2;
        return fib_N;
    }
    public static void main(String[] args) {
        
        int x = 8;
        System.out.println(fibonacciseries(x));
    }
}
