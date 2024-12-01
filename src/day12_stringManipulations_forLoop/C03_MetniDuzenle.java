package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_MetniDuzenle {


    //Kullanicidan bir String alin, String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
    // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz..");
        String metin = scanner.nextLine();

        if (metin.length()%2==0){

            metin = metin.substring(0,metin.length()/2) +
                    ":)"+
                    metin.substring(metin.length()/2);

            System.out.println(metin);

        }else {

            System.out.println(metin.substring(0, metin.length() / 2)+
                    ":("+
                    metin.substring(metin.length()/2+1)


            );


        }


    }


}
