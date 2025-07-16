package Ch9_String;

public class CharAtMethod {
    public static void main(String[] args) {
        String msg = "Hi Vishal Singh";
        char ch = msg.charAt(11);
        System.out.println(ch);
        System.out.println(msg.charAt(7));

        for(int i=0; i<msg.length(); i++)
        {
            System.out.println(msg.charAt(i));
        }
    }
}
