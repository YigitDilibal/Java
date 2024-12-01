package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C04_SifreKontroluTekrarli {

    /*
    kullanicidan bir sifre isteyip
    asagidaki sartlari kontrol eden ve kullaniciya duzeltmesi gereken tum eksikleri soyleyen
    eger tum sartlari saglarsa "sifre basariyla kaydedildi" yazdiran bir method olsuturun
    -ilk harf kucuk harf olmali
    -son karakter rakam olmali
    -sifre bosluk icermemeli
    -uzunlugu en az 10 karakter olmali
    Method kullanici uygun sifre girinceye kadar yeniden sifre istemeye devam etmeli
     */

    public static void main(String[] args) {

        sifreKontrolEt();






    }

    public static void sifreKontrolEt(){

        Scanner scanner = new Scanner(System.in);

        boolean sifreIstemeyeDevam = true;
        String sifre= "";

        while (sifreIstemeyeDevam == true){

            System.out.println("Lutfen sifrenizi giriniz.");
            sifre = scanner.nextLine();

            int sayac = 0;

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
                sifreIstemeyeDevam = false;
            }






        }

    }


}
