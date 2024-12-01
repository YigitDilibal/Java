package day14_nestedForLoops_methodKullanma;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        /* kullanicidan satir ve sutun sayisini alip
           asagidaki sekli olusturun.
            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen satir sayisiniz giriniz.");
        int satir = scanner.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz.");
        int sutun = scanner.nextInt();

        for (int i = 0; i < satir ; i++) { // satirlari kontrol eder

            for (int j = 1; j <= sutun ; j++) { // her bir satirdaki sutunlari kontrol eder

                System.out.print(i + j + " ");


            }
            System.out.println("");

        }

    }
}
