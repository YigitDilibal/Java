package day06_ifStatements;

import java.util.Scanner;

public class C01_bagimsizIfCumleleri {

    public static void main(String[] args) {


        int a = 23;
        int b = 45;

        // a b'den buyukse "a daha buyuk" yazdirin

        if (a > b) {

            System.out.println("a daha buyuk");
        }

        // Kullanicidan 2 tam sayi alin ilk sayi daha buyukse ilk sayi daha buyuk yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 adet tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1>sayi2){
            System.out.println("Ilk sayi daha buyuk");
        }

        // ikinci sayi cift ise "ikinci sayi cift yazdirin"

        if (sayi2%2==0){
            System.out.println("ikinci sayi cift");
        }

        // birinci sayi 100'den buyukse "sayilar cok guzel" yazdirin

        if (sayi1>100){
            System.out.println("sayi1 cok guzel");
        }

        // ikinci sayi negatifse "negatif sayilari sevmem" yazdirin

        if (sayi2<0){
            System.out.println("Negatif sayilari sevmem");
        }







    }
}
