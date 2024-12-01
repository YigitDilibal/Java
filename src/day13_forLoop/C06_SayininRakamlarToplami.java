package day13_forLoop;

import java.util.Scanner;

public class C06_SayininRakamlarToplami {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir sayi girin");

        int girilensayi = scanner.nextInt();
        int sayi=girilensayi;


        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;

        for (int i = 0; i < basamakSayisi; i++) {

            rakamlarToplami += sayi%10;
            sayi/=10;

        }

        System.out.println("Verilen "+ girilensayi + " sayisinin rakamlar toplami : " + rakamlarToplami);




    }
}
