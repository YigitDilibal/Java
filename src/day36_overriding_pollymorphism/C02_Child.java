package day36_overriding_pollymorphism;

import java.util.Scanner;

public class C02_Child extends C01_Parent{

    /*
        Overriding parent-child iliskisi olan class'larda olur

        Eger parent class'da var olan bir method
        child class'da da olusturulursa
        buna overriding(gecersiz kilma) denir

        bu durumda parent class'daki method overridden(gecersiz kilinan)
        child class'daki ise Overriding method(gecersiz kilan)
        olarak adlandirilir

     */

    public void method1(){
        // Overrides method in C01_Parent (day36_overriding_pollymorphism)
        // gecersiz kilar

    }

    public void method2(){
        // bir method'un override edebilmesi icin
        // sadece isminin ayni olmasi yetmez
        // signature'i da ayni olmalidir
        // method signature = method ismi + parametrelerin data turleri
        // signature  ==> method2

    }


    public void method3(int a, String b){
        // signature ==> method3 int String
        System.out.println(a);
    }


    @Override
    public int method4(int a) {
        // @Override 'a notasyon denir
        // ve kucuk bir goreve sahip,
        // sinirli miktarda kod icerirler

        // @Override notasyonu
        // parent class'daki overridden ve
        // child class'daki overriding method'lari takip eder
        // ve override etmeyi engelleyen bir durum olusursa CTE verir
        // tekrar override edebilenen kadar CTE gitmez
        return 4*a;
    }

    public String method5(String b,int c){
        // @Override notasyonu kullanmak ZORUNLU DEGILDIR
        // ancak @override kullanmazsak
        // overriding bozuldugunda Java CTE vermez
        // bu iki method yollarini ayirir
        // ve bagimsiz olarak hayatlarini devam ettirirler
        return b.toLowerCase();
    }

    public static void method6(){
        // static method'lar override edilemez
        // ayni isimde ve ayni signature'da method olusturabiliriz
        // ama Java bunlari overriding method olarak kabul etmez
        // birbirinden bagimsiz method'lar kabul eder

        // parent class'daki method static olarak isaretlenmisse
        // child class'daki de static olmak zorundadir
        // static olmazsa CTE olusur
    }


    private void method7(){
        // parent class'daki method private oldugundan
        // o method'u goremez ve dogal olarak
        // override edemez
    }


    public final void method8(String a){
        // overridden method is final
        // overridden method final oldugundan degistirilemez
        // yani override edilemez
        // parametreyi CTE'yi eklemek icin yazdik

    }


    public double method9(double a) {
        // her ne kadar signature'a dahil olmasa da
        // access modifier da overriding icin onemlidir
        // parent class'daki method public oldugundan
        // child class'daki overriding method
        // sadece public olabilir
        // cunku child parent'i kisitlayamaz.

        return a-4;

    }


    void method10() {
    }


    public void method11(){
        // her ne kadar signature'a dahil olmasa da
        // return type da overriding icin onemlidir
        // parent class'daki method'un return type'i
        // void veya primitive ise
        // child class'daki method ayni return type'a sahip olmalidir.
    }

    public int method12(){
        return 12;
    }

    public String method13(){
        // parent class'daki return type non primitive ise
        // child class'daki return type
        // parent class'daki ile ayni veya
        // o class'in child class'i olabilir.
        return "";
    }

    public String method14(){
        // parent class'daki methodun return type'i Object
        // child class'daki methoodun return type'i
        // object veye Object'in child class'i olabilir.
        // yani butun non primivite ler
        return "";
    }


    
    @Override
    public void method15() {
        super.method15();
    }
}