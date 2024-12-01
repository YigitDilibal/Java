package day14_nestedForLoops_methodKullanma;

import java.util.Scanner;

public class C04_SekilUcgenOlursa {

    public static void main(String[] args) {

        /*
    Kullanicidan satir sayisini alip
    asagidaki sekli olusturun

    *
    * *
    * * *
    * * * *

 */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen satir sayisiniz giriniz.");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {

            for (int j = 0; j < i ; j++) {

                System.out.print("* ");

            }

            System.out.println("");


        }




    }
}
