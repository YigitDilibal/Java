package day14_nestedForLoops_methodKullanma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_KendiSubsctringMethodumuz {

    public static void main(String[] args) {

        String str = "Java her gecen gun daha da guzellesiyor";

        /*

        Kullanicidan baslangic ve bitis degerlerini alin
        ve baslangic indexi dahil, bitis indexi haric olacak sekilde
        str'daki baslangic ve bitis index'leri arasindaki karakterleri yazdirin
        - eger kullanicinin verdigi indexler negatif veya str'in sinirlari disinda ise
        uyari mesaji yazdirin
        - baslangic degeri bitis degerinden buyuk olursa
        hata mesaji yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic index'ini giriniz..");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis index'ini giriniz...");
        int bitis = scanner.nextInt();

        if (baslangic < 0 || bitis < 0 || baslangic>str.length() || bitis>str.length()){
            System.out.println("Index'ler metnin sinirlari icinde olmali");
        }else if (baslangic > bitis){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz.");
        } else {

            for (int i = baslangic; i <bitis; i++) {

                System.out.print(str.charAt(i));

            }
            System.out.println("");

            System.out.println(str.substring(baslangic, bitis));




        }




    }
}
