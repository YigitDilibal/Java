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
     */

    // child class'larin bulundurmasi zorunlu olsun
    public void method1 (){

    }

    // zorunlu olsun
    public int method2 (){
        return 20;
    }

    // zorunlu olmasin
    public String method3 (){
        return null;
    }

    // zorunlu olmasin
    public void method4(){

    }


}
