package day17_doWhileLoop_scope;

public class C05_ClassLevelVariablelar {

    /*
    Class level variable demek
    Local bir kod blogunun icinde degil
    direk class icerisinde olusturulan variable'lardir

    Ve scope'lari tum Class'dir

    Yani teknik olarak tum class'dan kullanilabilirler

    ancak kullanma yontemi variable'in static olup olmamasina gore degisir

     */

    static int sayiS = 20;
    int sayiI;

    String strI= "Tavuk";
    static String strS;



    public static void main(String[] args) {

    }


    public static void method1(){

    }


    public void method2(){

    }
}
