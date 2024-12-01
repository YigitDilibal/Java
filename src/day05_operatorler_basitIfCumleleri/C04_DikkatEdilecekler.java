package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C04_DikkatEdilecekler {

    public static void main(String[] args) {

        //kullanicidan bir karakter alin, girilen karakter kucuk harf ise true, kucuk harf degilse false yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz..");
        char girilenKarakter = scanner.next().charAt(0);


        // istenen islemi 2 turlu yapabiliriz.

        // 1. Character wrapper class ile
        System.out.println(Character.isLowerCase(girilenKarakter));

        // 2. ASCII table ve karsilastirma operatoru girebiliriz.
        // istenen durum 2 degerin arasiysa AND kullanilir

        System.out.println(girilenKarakter>='a' & girilenKarakter <= 'z');



    }
}
