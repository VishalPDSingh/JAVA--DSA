package Ch9_String;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str= "hello world";
        int num = str.indexOf("llo");
        System.out.println(num);

        int num1 = str.indexOf("llo",3);
        System.out.println(num1);
    }
}
