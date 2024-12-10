package day39_exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class C04_MultipleException {

    public static void main(String[] args) {

        String str = "Java Candir";
        int[] arr = {2,3,3,4,5,6,9,7,6,4,7,8,6,6,7,7,8};

        // kullanicidan index olarak 0 veya pozitif bir tamsayi alin
        // (kullanicinin sayi girme konusunda giciklik hakki kullanmadigini kabul edelim)
        // str ve arr'de o index'deki karakteri veya sayiyi yazdirin
        // eger sinirin disinda ise en buyuk index'i yazdirin

        Scanner scanner = new Scanner(System.in);

        /*
            Eger birden fazla exception olasiligi varsa
            bu exception'lar icin cozum uretmeden once
            aralarinda parent-child iliskisi var mi kontrol etmemiz gerekir

            Eger aralarında parent child iliskisi yoksa
            ekstra bir kontrol girmeden
            1- ayri ayri try-catch
            2- tek try multiple catch
            3- tek try ve daha kapsamli bir catch
            4- ic ice try-catch yapabiliriz
         */
        System.out.println("Lutfen index olarak 0 veya pozitif bir tamsayi giriniz.");
        int index = scanner.nextInt();

        try {
            System.out.println("arr'deki eleman : " + arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array icin en buyuk index degeri : " + (arr.length-1));

        }

        try {
            System.out.println("Str'daki karakter : " + str.charAt(index));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Str icin en buyuk index degeri : " + (str.length()-1));

        }













    }


}
