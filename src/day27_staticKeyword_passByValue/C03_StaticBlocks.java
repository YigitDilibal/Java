package day27_staticKeyword_passByValue;

public class C03_StaticBlocks {

    C03_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    static {
        System.out.println("static blok 2 calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    static {
        System.out.println("Static blok1 calisti");

        /*
        static blok class'daki herseyden hatta main methoddan bile once calisir

        Eger class calismaya baslamadan once
        yapilmasi gereken bi islem varsa
        (ornegin database baglantisi yapmak, belirli variable'lara baslangic degeri atamak..)
        static variable kullanilir

        Eger boyle bir ihtiyaciniz yoksa
        hic kullanmasaniz da olur
         */

    }

    public static void method1(){
        System.out.println("method1 calisti");
    }


}
