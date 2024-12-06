package day37_abstractClasses;

public abstract class C03_KuralciParent {

    /*
        java'da parent class'lar child class'larini belirleyemez.

        Ama eger
        "Beni parent edinecek class'lar
        benim belirledigim method'lari bulundurmak zorunda kalsin"
        demek istiyorsaniz.
        abstraction kullanmalisiniz.

        1- Eger bir parent class'i
           child class'lar uzerinde soz sahibi kilmak icin
           o class'i abstract class/interface yapmalisiniz.

        2- class'da bulunan method'lardan
           hangilerini child class'larin bulundurmasi zorunlu olacaksa
           o methodlari belirlemeli ve abstract method yapmalisiniz.

           abstract (soyut) bir body'si olmayan yapi demektir.
           bu method'lar bizim bildigimiz method'lardan farklilasirlar
           adeta standart'lardaki bir cumle gibi olurlar
     */

    // child class'larin bulundurmasi zorunlu olsun
    // child class'larin method1'i bulundurmasi zorunludur
    public abstract void method1 ();


    // zorunlu olsun
    public abstract int method2 ();

    // zorunlu olmasin
    public String method3 (){
        return null;
    }

    // zorunlu olmasin
    public void method4(){

    }

    /*
         Abstract yapılar OBJE OLUSTURMAK icin degil
         Kendilerini parent edinen class'lar icin
         standartlari belirlemeyi amaclar

         abstract yapilar abstract method'lar barindirdigi icin
         concrete (somut) class'lar gibi
         obje olusturamazlar

         concrete : abstract olmayan
                    Bugune kadar olusturdugumuz tum class'lar ve method'lar
                    soyut olmadiklari icin concrete olarak adlandirilir.
     */


}
