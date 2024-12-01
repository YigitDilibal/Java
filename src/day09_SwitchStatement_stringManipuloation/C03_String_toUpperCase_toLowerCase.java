package day09_SwitchStatement_stringManipuloation;

import java.util.Locale;

public class C03_String_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir.";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); //Java Candir.

        /*
        String'de method ile yapilan degisikler
        sadece o satira aittir.
        String'de kalici degisiklik yapmaz.

        Eger method ile yapilan degisikligin kalici olmasini istiyorsak
        ATAMA yapmaliyiz.

         */

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        /*
        Eger bir dilde
        bir harfin kucuk ve buyuk hali ingilizce'den farkliysa
        (ornegin I'yi ingilizce olarak kucuk yaparsak i, ama turke yaparsak ı olur.
         */

        String str2 = "YAPMAYIN";
        System.out.println(str2.toLowerCase(Locale.forLanguageTag("tr"))); // yapmayın





    }
}
