package day13_forLoop;

import java.util.Scanner;

public class C10_AsalSayi {

    public static void main(String[] args) {


        // Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");
        int girilensayi = scanner.nextInt();

        for (int i = 2; i < girilensayi ; i++) {

            if (girilensayi % i == 0){
                System.out.println("asal degil");
                break;
            }

            if (i == girilensayi-1){
                System.out.println("Asal sayi");

            }

        }




    }
}
