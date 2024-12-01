package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenmeyenIsimleriSilme {

    public static void main(String[] args) {

        // Verilen String bir listede
        // istenmeyen harf iceren elementleri silip,
        // kalan kismini yazdirin

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cem","Canan","Cemil"));
        String istenmeyenHarf = "C";

        System.out.println(istenmeyenElementleriSil(isimler, istenmeyenHarf));


    }

    public static List<String> istenmeyenElementleriSil (List<String> isimler, String istenmeyenHarf){

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));
                i--;
            }

        }

        return isimler;
    }
}
