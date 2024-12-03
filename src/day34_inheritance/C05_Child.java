package day34_inheritance;

public class C05_Child extends C04_Parent{

    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";


    public static void main(String[] args) {


        C05_Child obj = new C05_Child();
        obj.method1();

    }

    public void method1(){

        String str = "Child class method";
        String t = "Cansu";
        String z = "Oguzhan";

        System.out.println(str); // "Child class method" ==> scope'a bakar, bulur ve yazar
        System.out.println(this.str); // "Child class" ==> Class level'a bakar, bulur ve yazar
        System.out.println(super.str); // "Java candir" ==> Parent class'a bakar, bulur ve yazar.

        System.out.println(z); // Oguzhan ==> scope'da bulur ve yazar
        // System.out.println(this.z); // aramaya class'dan baslar, parenta da bakar
                                        // bulamadigi icin CTE verir.
        // System.out.println(super.z); // // aramaya parent'dan baslar bulamadigi icin CTE verir.

        System.out.println(t); // Cansu
        System.out.println(this.t); // Hamza // scope'u pass gecti ve direkt class levela gitti
        // System.out.println(super.t); // aramaya parent'dan baslar bulamadigi icin CTE verir.

        System.out.println(k); // Ahmet => Scope'da bulamadi class levela gitti
        System.out.println(this.k); // Ahmet ==> scopu'u pass gecip direkt class'da aradi
        // System.out.println(super.k); // aramaya parent'dan baslar bulamadigi icin CTE verir.

        System.out.println(s); // Anil ==> Aramaya scope'da baslar bulamadikca yukari gider.
        System.out.println(this.s); // Anil ==> Aramaya class'dan baslar, bulamayinca parenta gider
        System.out.println(super.s); // Anil ==> Direkt parenta gider.

       /*
            Bir scope'da herhangi bir variable'i kullanmak istedigimizde
            1- Java once icinde bulundugumuz scope'a bakar
            2- scope'da bulamazsa class level'a bakar
            3- class level'da da bulamazsa parent class(lar)'a bakar

            Kullanici isterse bu siralamayi byPass edebilir
            Eger scope'u byPass edip direkt class level'i kullanmak isterse this. ....
            Eger scope'u ve class level'i byPass edip
            direkt parent class'a gitmek isterse super. .... kullanabilir

            baslangic seviyesi soylendiginde
            o seviyeden aramaya baslar
            bulamazsa ileri dogru gider
            ama asla geri donus olmaz

            method'lar icin de aynisi gecerlidir
            hic bir sey yazilmazsa method2() ==> icinde bulundugu class'da arar
                                                 bulamazsa parent class'a gider

            this.method2() ==> icinde bulundugu class'da arar, bulamazsa parent class'a gider

            super.method2() ==> aramaya direkt parent class'dan baslar

         */




    }
}

