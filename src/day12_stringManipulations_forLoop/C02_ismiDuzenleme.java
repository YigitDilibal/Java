package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C02_ismiDuzenleme {

    public static void main(String[] args) {

// Kullanicidan isim ve soyismini ayri ayri alin.
// - ismi daha uzun ise,
//    isim ve soyismi ilk harf buyuk kalanlar kucuk olacak seklinde yazdirin
//  - soyisim daha uzun ise
//    ismi ilk harf buyuk digerleri kucuk, soyismin tamami buyuk harf olacak sekilde yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz..");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz..");
        String soyisim = scanner.nextLine();

        if (isim.length()>soyisim.length()){

            isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
            soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();

            System.out.println(isim + " " + soyisim);

        } else if (soyisim.length()>isim.length()) {

            isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
            soyisim = soyisim.toUpperCase();

            System.out.println(isim + " " + soyisim);

        } else{
            // ayni uzunlukta olurlarsa bir sey yapin denmemis :D
        }


    }
}
