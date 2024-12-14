package day44_mapsUpdate_entrySet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C10_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
//        sayilar.add("Ali");
//        sayilar.add(true);
//        sayilar.add('a');

        int[] arr = {3,5,6};

//        sayilar.add(arr);

        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","c"));

//        sayilar.add(harfler);

        List<Object> nesneler = new ArrayList<>();
        nesneler.add(10);
        nesneler.add("Ali");
        nesneler.add(true);
        nesneler.add('a');
        nesneler.add(arr);
        nesneler.add(harfler);

        System.out.println(nesneler);

        /*
            Data turu olarak daha genel olan Object secmek
            farklı data türündeki değerleri ve variable'lari koymak acisindan kolaylik olsa da,
            sonrasinda erisim ve kullanma aninda sorunlara yol acabilir
         */

        // 0. indexteki sayinin 2 katini yazdirin

        System.out.println((Integer)nesneler.get(0)*2);

        // 1. indexteki Stringin lengthini yazdirin
        System.out.println((  (String)nesneler.get(1))  .length()  );

        // 4. index'teki arrayi yazdirin

        System.out.println(Arrays.toString((int[])nesneler.get(4)));

        // 5. indexteki harfler listesinde a harfi olup olmadigini yazdirin.

        System.out.println( ((List<String>)nesneler.get(5)).contains("a") );






    }


}
