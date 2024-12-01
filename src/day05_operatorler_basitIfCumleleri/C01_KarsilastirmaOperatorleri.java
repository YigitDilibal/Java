package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C01_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        // kullanicidan bir tam sayi isteyin, girilen tam sayi cift ise true cift degilse false yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz..");

        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi%2==0);

        // girilen sayi 23'un kati ise true, 23'un kati degilse false yazdirin

        System.out.println( girilenSayi % 23 == 0 );

//        if (girilenSayi%2==0) {
//        System.out.println("Girdiginiz sayi Cift bir sayi"); }
//
//        if (girilenSayi%2==1) {
//        System.out.println("Girdiginiz sayi Tek bir sayi"); }




    }
}
