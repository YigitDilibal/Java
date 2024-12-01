package day11_stringManipulations;

public class C07_replaceFirst {

    public static void main(String[] args) {


        String str = "354 sen ver , 5 de ben ekleyeyim 8 olsun";

        // ilk syi buyuk s yap

        System.out.println(str.replaceFirst("s", "S")); // 3 Sen ver , 5 de ben ekleyeyim 8 olsun

        // ilk spacei * yapin

        System.out.println(str.replaceFirst(" ", "*")); // 3*sen ver , 5 de ben ekleyeyim 8 olsun

        // ilk sayi yerine * yapin

        System.out.println(str.replaceFirst("\\d+", "*"));

    }
}
