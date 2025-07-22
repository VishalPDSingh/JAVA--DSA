package Ch10_Recursion;

public class Recursion2 {
    public static void reverse(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        else
        {
            System.out.println(n);
            reverse(n-1);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        reverse(x);
    }
}
