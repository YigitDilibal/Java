package day02_variables_Scanner;

import java.util.Scanner;

public class C06_Problem2_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {

        /* Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz..");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyadinizi giriniz..");
        String soyIsim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz..");
        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyIsim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

        // veya

        System.out.println("Isminiz : " +isim+
                           "\nSoyisminiz : "+ soyIsim+
                           "\nYasiniz : " + yas +
                           "\nKaydiniz basariyla tamamlanmistir."
        );



    }
}
