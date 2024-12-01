package day24_constructors;


public class C02_Hemsire {

    C02_Hemsire(){

        //default constructor buna benzer
        //ama bu default constructor degildir
        //bir constructor gorunuyorsa default constructor olamaz.

    }

    String isim = "Isim atanmadi";
    String adres = "Adres atanmadi";
    String tel = "Tel atanmadi";

    /*
    JAVA OOP (Object Orianted Programming) kullanir
    yani obje olusturup
    olusturulan objelerde islem yapmaya dayanir

    Java her class'dan obje olusturulabilmesi icin
    her class'a gorunmeyen bir constructor koyar
    bu constructa default constructor denir

    Default constructor
        -Gorunmez
        -Parametresizdir
        -body'sinde kod yoktur


       Kodu yazan kisi
       Class'ta gorunur bir constuctor olusturursa
       Java Default Constructor'u siler

       Gorunur bir constructor varsa o class'da default Constructor yoktur.

     */

    /*
    Constructor syntex (yazim bicimi) olarak methoda benzer
    ancak method degildir

    Bir kod blogunun Constructor olabilmesi icin
    2 sarti MUTLAKA saglamasi gerekir

    1- Ismi class ismi ile tamamen ayni olmalidir
    2- Return type olmamalidir.
     */

    /*
        Methodlar naming convention'a gore (isimlendirme genel kabul)
        kucuk harfle baslar ve camel case kullanilir

        Ancak buyuk harfle baslasa da
        Java CTE vermez

     */

    public void BuyukIsimliMethod(){

    }

    public void C02_Hemsire(){
        // return type'i oldugu icin methoddur
    }


}