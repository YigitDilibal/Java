package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C02_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {


        sayininrakamlartoplami(94156);


    }

    public static void sayininrakamlartoplami (int verilenSayi){

        int sayi=verilenSayi;


        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;

        for (int i = 0; i < basamakSayisi; i++) {

            rakamlarToplami += sayi%10;
            sayi/=10;

        }

        System.out.println("Verilen "+ verilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);


    }


}
