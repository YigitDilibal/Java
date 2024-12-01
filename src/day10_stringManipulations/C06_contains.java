package day10_stringManipulations;

public class C06_contains {

    public static void main(String[] args) {

        String str = "Bugun cok ama cok mutluyum";

        System.out.println(str.contains("u")); // true

        System.out.println(str.contains("b")); // false

        System.out.println(str.contains("cok ama")); // true

        /*
        // System.out.println(str.contains('g'));

        Charsequence : char dizilim
        char'larin yan yana gelmesiyle olusan nesne
        yani bildigimiz String
         */

        System.out.println(str.contains("n a")); // false
        // yan yana 3 karakter olarak "n a" arar.

        System.out.println(str.contains("")); // her zaman true

        // "Bugun cok ama cok mutluyum"

        // verilen str metninin case sensitive olmadan B icerdigini kontrol edin.

        // containsIgnoreCase diye bi method olmadigindan
        // hem ana metni hem de aranan metni toLowerCase() toUpperCase() yapip
        // case farkliliklarindan kurtuluruz.

        // "Bugun cok ama cok mutluyum"

        System.out.println(str.toLowerCase().contains("b")); // true
        System.out.println(str.toUpperCase().contains("B")); // true


    }
}
