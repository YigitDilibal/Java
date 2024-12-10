package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_AlinanSayilariToplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double girilenSayi = 0;
        double toplam = 0;
        String girilenMetin = "";
        int sayac = 0;


        do {

            System.out.println("Toplamak icin sayi giriniz, \n bitirmek icin Q'ya basiniz..");

            try {
                girilenSayi = scanner.nextDouble(); // kullanici Q veya istenmeyen bir input girerse
                                                    // InputMismatchException olusur
                toplam+= girilenSayi;
                sayac++;
            }catch (InputMismatchException e){
                girilenMetin = scanner.nextLine();

                if (girilenMetin.equalsIgnoreCase("q")){

                }else {
                    System.out.println("ya sayi gir ya da q'ya bas");
                }

            }

        }while (!girilenMetin.equalsIgnoreCase("q"));


        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);



    }

}
