package day06_ifStatements;

import java.util.Scanner;

public class C05_susluParantezKullanimi {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alin sayi 3e bolunuyorsa sayi 3 un tam kati yazdirin
        //sayi 5e bolunuyorsa sayi 5in tam kati yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz..");

        int sayi = scanner.nextInt();

        // Eger bir if statementda {} kullanilmazsa ilk ; e kadar olan kismi if bodysi olarak kabul eder

        // Sonuc : Eger if body sadece 1 satir ise suslu parantez kullanmasak da olur
        // ama if body birden fazla satir ise mutlaka {} kullanilmalidir

        if (sayi%3 == 0) System.out.println("Sayi 3un tam kati");

        if (sayi%5 == 0 ) System.out.println("Sayi 5'in tam kati");

        // sayi 7ye bolunuyorsa iki farkli sout icinde 7 ile bolunuyor guzel sayi

        if (sayi % 7 == 0)
            System.out.println("7 ile bolunuyor");
        System.out.println("guzel sayi");

    }
}
