package _KendiCozdugumProblemler;

import java.util.Scanner;

public class Problem1_VariablesAndScanner {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz..");
        int girilenSayi = scanner.nextInt();

        System.out.println("Lutfen bir karakter giriniz..");
        char girilenKarakter = scanner.next().charAt(0);

        System.out.println("Lutfen bir ondalikli sayi giriniz..");
        double girilenDouble = scanner.nextDouble();

        System.out.println("Girdiginiz tamsayi : " + girilenSayi+
                         "\nGirdiginiz karakter : " + girilenKarakter +
                         "\nGirdiginiz Ondalikli sayi : " + girilenDouble );






    }

}
