package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C06_DikkatEdilecekler3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz..");

        char girilenKarakter = scanner.next().charAt(0);

        //girilen karakter buyuk harf degilse true, buyuk harf ise false yazdirin.

        System.out.println(girilenKarakter<'A' || girilenKarakter>'Z');

        // veya

        System.out.println(     !(Character.isUpperCase(girilenKarakter))   );



    }
}
