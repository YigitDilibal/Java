package day31_stringBuilder_accessModifier;

public class C03_StringMethodlari {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir");

        System.out.println(sb.toString().contains("a"));

        System.out.println(sb.substring(4));
        System.out.println(sb);


    }
}
