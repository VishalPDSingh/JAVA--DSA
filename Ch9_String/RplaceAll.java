package Ch9_String;

public class RplaceAll {
    public static void main(String[] args) {
        String name = "vishal prasad";
        String naam = name.replaceAll("prasad", "singh");
        System.out.println(naam);

        String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regex = "(?i)cat";
        System.out.println(myStr.replaceAll(regex, "dog"));
    }
}
