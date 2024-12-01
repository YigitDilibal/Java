package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tamsayilar isteyin
        // kullanici tam sayi verdigi muddetce toplamaya ekleyin
        // 0 veya negatif sayi girerse toplama eklemeyin
        // toplam 500 veya daha fazla oluncaya kadar sayi istemeye devam edin
        // toplam siniri gecince kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin.

        sayiToplama();




    }

    public static void sayiToplama (){
        Scanner scanner = new Scanner(System.in);

        int toplam= 0;
        int sayi =0;
        int sayac = 0;

        while (toplam <500){

            System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz.");
            sayi = scanner.nextInt();

            if (sayi>0){
                toplam+=sayi;
                sayac++;
            }else {
                System.out.println("Girilen sayi pozitif olmalidir.");
            }

        }

        System.out.println("Girilen " +  sayac + " adet pozitif tamsayinin toplami: " + toplam);


    }

}
