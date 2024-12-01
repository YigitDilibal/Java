package day04_Matematikselislemler_Increment;

import java.util.Scanner;

public class C02_MatematikselIslemler {

    public static void main(String[] args) {

//        int sayi = 423;
//
//        System.out.println(sayi%10); // 3
//        System.out.println(sayi/10); // 42.3 ==> 42

        //kullanicidan 3 basamakli bir pozitif tamsayi alin
        // ve sayinin rakamlar toplamini alin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir tam sayi giriniz..");

        int sayi = scanner.nextInt();

        System.out.println("Girilen sayinin rakamlarinin toplami : " + ((sayi%10)+((sayi/10)%10 )+ ((sayi/10)/10))   );



    }
}
