package day02_variables_Scanner;

import java.util.Scanner;

public class C09_Problem5_SayilarinDegerleriniDegistirme {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1. tam sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2. tam sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        int bosAlan;

        bosAlan = sayi1;
        sayi1 = sayi2;
        sayi2 = bosAlan;

        System.out.println("1. sayi : " + sayi1 + ", 2. sayi : " + sayi2);
    }
}
