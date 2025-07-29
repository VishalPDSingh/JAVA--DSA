package Ch11_BitManipulation;

public class EvenAndOdd {
    public static void evenOdd(int n)
    {
        int bitMask = 1;
        if(n%bitMask ==0)
        {
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        evenOdd(12);
    }
}
