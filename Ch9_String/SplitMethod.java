package Ch9_String;

public class SplitMethod {
    public static void main(String[] args) {
        String name = "My name is vishal";
        String myArray[] = name.split(name);
        for (String s : myArray) {
	    System.out.println(s);
        }
      //  System.out.println(myArray);
    }
}
