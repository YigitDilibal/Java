package day27_staticKeyword_passByValue;

public class C04_StaticOlmayanBlok {

    C04_StaticOlmayanBlok(){
        System.out.println("Constructor calisti");
    }

    static {
        System.out.println("static blok 2 calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C04_StaticOlmayanBlok obj1 = new C04_StaticOlmayanBlok();
        C04_StaticOlmayanBlok obj2 = new C04_StaticOlmayanBlok();
        C04_StaticOlmayanBlok obj3 = new C04_StaticOlmayanBlok();
    }

    {
        System.out.println("Static olmayan blok1 calisti");

        /*

       static olmayan bloklar ise
       Eger bir obje olusturulmadan once yapilmasi gereken ayarlar varsa
       bu ayarlari yapmak uzere kullanilir

         */

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
