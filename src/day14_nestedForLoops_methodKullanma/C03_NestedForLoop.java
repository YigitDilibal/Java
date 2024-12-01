package day14_nestedForLoops_methodKullanma;

import java.util.Scanner;

public class C03_NestedForLoop {

    public static void main(String[] args) {


        /*
    Kullanicidan satir sutun sayisini alip
    asagidaki sekli olusturun

    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *

 */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen satir sayisiniz giriniz.");
        int satir = scanner.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz.");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun ; j++) {

                System.out.print("* ");

            }

            System.out.println("");

        }


    }
}
