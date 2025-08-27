package Ch13_Hashing;

public class HashingDemo {
    public static void main(String[] args) {
        // Direct Address table
        int keys [] = new int[10];

        // insert 
        keys[8] = 1;
        keys[2] = 1;
        keys[1] = 1;

        for(int i=0; i<keys.length; i++)
        {
            if(keys[i] != 0 )
            {
                System.err.println("true");
            }else
            System.out.println("false");
        }
    }
}
