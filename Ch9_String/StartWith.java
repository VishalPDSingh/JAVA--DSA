package Ch9_String;

public class StartWith {
    public static void main(String[] args) {
        String str = "hello world";
        boolean newStr = str.startsWith("h");
        System.out.println(newStr);
        System.out.println(str.startsWith("oll"));

        //end with
        boolean endwith = str.endsWith("ld");
        System.out.println(endwith);
    }
}
