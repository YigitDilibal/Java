package day24_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {


    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        C02_Hemsire hemsire1 = new C02_Hemsire();
        hemsire1.isim = "Canan";
        hemsire1.adres= "Balgat";

        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.adres);
        System.out.println(hemsire1.tel);

        C02_Hemsire     hemsire2       =        new      C02_Hemsire();
    //   Class ismi     obje ismi    atama    keyword     Constructor
    // Bir class'dan obje olusturulup ilk deger atamasi yapmak icin
    // Mutlaka bir constructor CALISMALIDIR

        hemsire2.isim = "Sumeyra";

        System.out.println(new C02_Hemsire().isim);
        // 40. satirda new keyword'u ile yeni bir obje olusturulur
        // sadece o satirda bu obje kullanilabilir
        // ama bir variable'a kaydedilmedigi icin
        // bu obje o satirda kullanilir ve sonra cop olur

        C02_Hemsire hemsire3;

        // System.out.println(hemsire3);

        //variable hemsire3 might not have been initialized

        //Localde olusturulan variable'lar
        // deger atanmadan olusturulabilir
        // ama deger atanmadan kullanilamaz

        C02_Hemsire hemsire4 = null;
        System.out.println(hemsire4.isim);
        // Cannot read field "isim" because "hemsire4" is null


    }
}