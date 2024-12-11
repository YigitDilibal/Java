package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions_ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src\\day40_exceptions\\Notlar.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        /*

            Unhandled exception: java. io. FileNotFoundException
            ya dosyayi bulamazsam, bana bir yol goster diyor

            bir exception olasiligi varsa
            bunu kontrol altina almanin(handle) en iyi yolu try-catch'dir

            Ama dosyaya ulasamazsak
            kodun calismasi da bir anlam ifade etmeyecekse
            try-catch ile handle edip yola devam etmek anlamsiz olur.

            EGER
            sadece kodlarimizi calistirmak
            ve exception olursa mudahale etmemek istersek
            method deklarasyonuna throws keyword ile muhtemel exception'i yazariz

            throws FileNotFoundException
            bu yazimin iki amaci var

            1- Java'ya bu riskin farkinda oldugumuzu
            ve bir sorun olursa exception firlatmasini istedigimizi soylemis oluyoruz

            2- bizden sonra kullanacak kisilere
               bu class'ta exception riski bulundugunu
               iletmis oluruz

         */

    }


}
