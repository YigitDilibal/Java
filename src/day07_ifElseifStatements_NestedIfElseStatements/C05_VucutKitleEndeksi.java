package day07_ifElseifStatements_NestedIfElseStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //  (kilo*10000 / (boy *boy))
        //  vucut kitle endeksi 30’dan buyukse obez,
        //  25-30 arasi ise kilolu,
        //  20-25 arasi ise normal,
        //  20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu kg olarak giriniz..");
        double kilo = scanner.nextInt();
        System.out.println("Lutfen boyunuzu cm olarak giriniz..");
        int boy = scanner.nextInt();

        double vki= ((kilo*10000) / (boy*boy));

        if (vki > 30){
            System.out.println("Obez :D");
        } else if (vki > 25) {
            System.out.println("kilolu");
        } else if ( vki > 20) {
            System.out.println("normal");
        } else {
            System.out.println("zayif");
        }



    }


}
