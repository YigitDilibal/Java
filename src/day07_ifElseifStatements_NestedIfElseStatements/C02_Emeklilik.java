package day07_ifElseifStatements_NestedIfElseStatements;

import java.util.Scanner;

public class C02_Emeklilik {

    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // yas 65den buyukse emekli olabilirsin
        // yas 65den kucuksa daha .. yil calismalisin yazdirin
        // kullanici 20den kucuk bir yas veya 80den buyuk bir yas girerse
        // girilen yas icin emeklilik hesaplanamaz

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz..");
        int yas = scanner.nextInt();

        if (yas>80 || yas < 20){
            System.out.println("Girilen yas icin emeklilik hesaplanamaz.");
        } else if (yas>=65) {
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olmak icin " + (65- yas) + " yil daha calismalisin");
        }


    }
}
