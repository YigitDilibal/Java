package day27_staticKeyword_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {

        /*

        -Ayni scope icinde ayni isimde variable olusturamazsiniz
        -Local variable'lar farkli scope'dan kullanilamaz.
        -farkli scope'larda ayni isimde variable'lar olusturulabilir.
        farkli scope'lardaki ismi ayni olan variable'lar ayni variable degillerdir.
        -Java'da bir variable baska method'a yollanirsa
         variable'in kendisi degil value'si gonderilir
         Pass By Value



         */


        String str = "Ali";

        // String str = "Veli";

        int a = 60;

        method1(a);

        int sayi = 70;

    }

    public static void method1(int sayi){

       // System.out.println(str);

        String str;



        System.out.println(sayi*5);

    }

}
