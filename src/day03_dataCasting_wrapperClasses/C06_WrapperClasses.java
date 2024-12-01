package day03_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C06_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi = 20;

        /*
        primitive data turundeki variable'lar sadece deger barindirabilir
        non-primite data turundeki variable'ler ise hem deger hem hazir methodlar barindirir
         */

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        /*
        Java primitive data turundeki variable'lar icin de bazi methodlar kullanabilmemiz
        icin Wrapper Class'lari olusturmustur.

        Boolean, Character, Byte, Short, Integer, Long, Float, Double
         */

        String fiyat1 = "23.44";
        String fiyat2 = "43.18";

        // bu fiyatlarin toplamini bulun

        System.out.println(fiyat1+fiyat2); // 23.4445.18

        System.out.println(Double.parseDouble(fiyat1) + Double.parseDouble(fiyat2)); // 66.62

        // SADECE sayilardan veya noktadan olusuyorsa String sayilari matematiksel islem yapabilecegimiz
        // sayilara parse eder

        fiyat1 = "34";
        fiyat2 = "41";

        System.out.println(Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2)); // 75

        char k1 = 'd';

        // k1'i buyuk harf olarak yazdirin

        // casting ile yaparsak

        System.out.println((char)(k1-32)); // a 97, A 65 aralarinda 32 fark olur

        // Character wrapper class'indan method ile yapalim

        System.out.println(Character.toUpperCase(k1));


        // Kullanicidan bir karakter isteyin
        // Kullanicinin girdigi karakter harf ise true degil ise false yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz..");

        char girilenKarakter = scanner.next().charAt(0);

        System.out.println(Character.isLetter(girilenKarakter));

        // ayni karakter sayi ise true degilse false yazdirin

        System.out.println(Character.isDigit(girilenKarakter));




    }
}
