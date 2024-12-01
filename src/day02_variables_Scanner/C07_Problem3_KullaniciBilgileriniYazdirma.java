package day02_variables_Scanner;

import java.util.Scanner;

public class C07_Problem3_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz..");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyadinizi giriniz..");
        String soyIsim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz..");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " +isim.toUpperCase().charAt(0)+ " " + soyIsim + ", " + yas);


    }
}
