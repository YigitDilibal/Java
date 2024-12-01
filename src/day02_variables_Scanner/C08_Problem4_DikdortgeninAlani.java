package day02_variables_Scanner;

import java.util.Scanner;

public class C08_Problem4_DikdortgeninAlani {

    public static void main(String[] args) {

      //  Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin 1. kenar uzunlugunu yazin..");
        double kenar1 = scanner.nextDouble();
        System.out.println("Lutfen dikdortgenin 2. kenar uzunlugunu yazin..");
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kenar1*kenar2);


    }
}
