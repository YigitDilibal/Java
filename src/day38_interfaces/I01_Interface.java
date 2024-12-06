package day38_interfaces;

public interface I01_Interface {


    public abstract void method1();
    // public ve abstract gereksiz

    //public void method2(){} // Interface abstract methods cannot have body

    /*
         Interface'ler full abstraction saglar
         method deklarasyonuna pulbic veya abstract yazsaniz da yazmasaniz da
         butun method'lar public ve abstract'tir

         Interface'lerdeki class level variable'lar da
         yazilsa da yazilmasa da public, static ve final'dir.
         Class level variable'lara deger atama mecburiyeti yoktur
         ANCAK interface'deki variablelar dogustan final olduklarindan
         sonradan deger atama olasiligi yoktur, bu sebeple
         Interface'de olusturulan variable'lara deger atamak zorunludur.

         bir class interface'i parent edinmek isterse
         extends keyword yerine implements keyword kullanmalidir.
     */

    void method2(); // public ve abstract
    public int method3(); // public ve abstract
    abstract String method4(); // public ve abstract
    public abstract boolean method5(); // public ve abstract


    int SAYI1 = 10;
    public int SAYI2 = 20;
    static int SAYI3 = 30;
    final int SAYI4 = 40;
    public static final int SAYI5 = 50;



}
