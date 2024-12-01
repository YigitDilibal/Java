package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_EnUzunKelime {

    public static void main(String[] args) {

        // Kullanicidan en uzun kelimeyi bulmak uzere
        // tekrar tekrar kelime isteyip,
        // kullaniciya Q'ya (veya q) bastiginda
        // o ana kadar girilen en uzun kelimeyi donduren bir method olusuturun
        // eger ayni uzunlukta birden fazla kelime girildi ise herhangi biri olabilir


        System.out.println(enUzunKelimeyiBul());


    }

    public static String enUzunKelimeyiBul(){

        Scanner scanner = new Scanner(System.in);
        String girilenKelime = "";
        String enUzunKelime= "";

        System.out.println("Kelimeler giriniz, bitirmek icin q ya basiniz");

        while ( ! girilenKelime.equalsIgnoreCase("q")){ // buraya devam sarti yazilmali

            System.out.println("Lutfen bir kelime giriniz.");
            girilenKelime = scanner.next();

            if (girilenKelime.length()>enUzunKelime.length()){
                enUzunKelime=girilenKelime;
            }

        }

        return enUzunKelime;

    }
}
