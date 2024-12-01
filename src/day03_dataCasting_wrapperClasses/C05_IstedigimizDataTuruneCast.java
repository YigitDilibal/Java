package day03_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_IstedigimizDataTuruneCast {

    public static void main(String[] args) {



        int a = 23;
        int b = 5;

        System.out.println(a/b); // 4.6  ==> 4

        /*
        Java bir bolme isleminde bolunen ve bolen int ise
        sonuc da int olur
         */

        double c = a / b ;
        System.out.println(c); // 4.0

        // a/ b islemini yapip, sonucu ondalikli olarak bulup yazdirin

        System.out.println(   (double)(a / b) ); // 4.0

        System.out.println( (double) a / b  ); // 4.6

        System.out.println( a / (double) b  ); // 4.6

        System.out.println( (double)a / (double) b  ); // 4.6


        // kullanicidan bir karakter girmesini isteyin
        // ascii table'da girilen karakterden sonraki 3 karakteri
        // sirasiyla yanyana yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz..");
        char chr = scanner.next().charAt(0);

        System.out.println("girilen karakterden sonraki 3 karakter : " +(char)(chr+1)+(char)(chr+2)+(char)(chr+3));

    }
}
