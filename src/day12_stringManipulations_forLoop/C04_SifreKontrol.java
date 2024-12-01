package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C04_SifreKontrol {

    public static void main(String[] args) {

//        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
//        ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
//        eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

//                - ilk harf kucuk harf olmali
//        - son karakter rakam olmali
//                - sifre bosluk icermemeli
//        - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);

        int sayac = 0;

        System.out.println("Lutfen sifrenizi giriniz..");
        String sifre = scanner.nextLine();

        if ( ! Character.isLowerCase(sifre.charAt(0) )){

            System.out.println("ilk karakter kucuk harf olmali");
            sayac++;
        }

        if ( ! Character.isDigit(sifre.charAt(sifre.length()-1) )){

            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        if(sifre.length()<10){
            System.out.println("sifre en az 10 karakter olmali");
            sayac++;
        }

        if (sayac==0){
            System.out.println("Sifreniz basariyla kaydedildi.");
        }

    }
}
