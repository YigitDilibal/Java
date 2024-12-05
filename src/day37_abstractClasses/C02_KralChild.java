package day37_abstractClasses;

public class C02_KralChild extends C01_KuralciOlmayanParent{

    /*

    Klasik inheritance da Child class Kraldir

   1- istedigi class'i parent edinebilir.
   2- parent class'daki ozellikleri direkt kullanabilir
   3- parent class'da varolan methodlari isterse kendine uyarlayabilir.
   4- isterse parent class'da olmayan yeni ozellikler ekleyebilir.
     */

    public static void main(String[] args) {



    }

    public void method7(){
        method1();
    }

    public int method2(){
        return 40;
    }

    public String method3(){
        return "Ali Can";
    }



}
