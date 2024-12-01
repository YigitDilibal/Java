package day04_Matematikselislemler_Increment;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {


        // Eger yazildiklari satirda tek basina iseler
        // ++sayi ile sayi++ ve --sayi ile sayi-- ayni islemi yaparlar.
        // ve aralarinda bir fark olmaz.

        // Bu islemlerin oldugu satirda yazdirma veya baska bir islem varsa aralarinda bir fark olur



        int sayi = 20;
        sayi++;
        System.out.println(sayi); // 21
        ++sayi;
        System.out.println(sayi); // 22
        sayi--;
        System.out.println(sayi); // 21
        --sayi;
        System.out.println(sayi); // 20
    }


}
