package day10_stringManipulations;

public class C02_equalsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str6 = "ali";
        String str7 = "ALI";
        String str8 = "ALi";
        String str9 = "Ali ";
        String str10 = "Ali.";

        System.out.println("=================");

        System.out.println(str1.equalsIgnoreCase(str6)); // Ali equalsIgnoreCase ali ==> true
        System.out.println(str1.equalsIgnoreCase(str7)); // Ali equalsIgnoreCase ALI ==> true
        System.out.println(str1.equalsIgnoreCase(str8)); // Ali equalsIgnoreCase ALi ==> true
        System.out.println(str1.equalsIgnoreCase(str9)); // Ali equalsIgnoreCase "Ali " ==> false
        System.out.println(str1.equalsIgnoreCase(str10)); // Ali equalsIgnoreCase Ali. ==> false
    }
}
