package day39_exceptions;

import java.util.Scanner;

public class C06_DahaKapsamliTekException {
    public static void main(String[] args) {


        String str = "Java Candir";
        int[] arr = {2,3,3,4,5,6,9,7,6,4,7,8,6,6,7,7,8};

        // kullanicidan index olarak 0 veya pozitif bir tamsayi alin
        // (kullanicinin sayi girme konusunda giciklik hakki kullanmadigini kabul edelim)
        // str ve arr'de o index'deki karakteri veya sayiyi yazdirin
        // eger sinirin disinda ise en buyuk index'i yazdirin

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lutfen index olarak 0 veya pozitif bir tamsayi giriniz.");
        int index = scanner.nextInt();


        try {
            System.out.println("arr'deki eleman : " + arr[index]);
            System.out.println("Str'daki karakter : " + str.charAt(index));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Girdiginiz sayi str veya arr'deki index siniri asiyor");
        }





    }
}
