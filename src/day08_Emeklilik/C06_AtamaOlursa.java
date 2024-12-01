package day08_Emeklilik;

import java.util.Scanner;

public class C06_AtamaOlursa {
    public static void main(String[] args) {


        // Ternary operatoru

        // kullanicidan bir tamsayi isteyin

        // sayi pozitif ise 2  katina cikarin, sayi negatif ise degerini 100 artirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1 tamsayi girin...");
        int sayi = scanner.nextInt();

        sayi = (sayi > 0 ? sayi*2 : sayi+100);

        System.out.println("Sayinin yeni degeri : " + sayi);

        // sayinin yeni degeri cift ise degerini yariya indirin, tek ise degerini iki katina cikarin

        sayi = sayi %2 == 0 ? sayi/2 : sayi*2;




    }
}
