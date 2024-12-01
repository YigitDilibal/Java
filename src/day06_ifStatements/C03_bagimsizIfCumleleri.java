package day06_ifStatements;

import java.util.Scanner;

public class C03_bagimsizIfCumleleri {

    public static void main(String[] args) {

        //kullanicidan bir sayi alip sayi 5 e bolunebiliyorsa sayi 5in tam kati yazdirin

    Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz..");

        int sayi = scanner.nextInt();

        if (sayi % 5 == 0){
            System.out.println("sayi 5in tam kati");
        }






    }
}
