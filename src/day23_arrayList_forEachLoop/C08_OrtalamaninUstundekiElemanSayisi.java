package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtalamaninUstundekiElemanSayisi {

    public static void main(String[] args) {

        // verilen bir not listesinde
        // ortalama notu ve ortalamanin altindaki not sayisini yazdirin

        List<Double> notlar = new ArrayList<>(Arrays.asList(23.4, 67.8, 98.0, 87.5, 78.3));

        // once tum notlari toplayip, not ortalamasini bulalim

        double toplam = 0;

        for (double w: notlar){
            toplam+= w;
        }

        double ortalama = toplam / notlar.size();

        // artik ortalamanin altindaki not sayisini bulabiliriz
        int sayac = 0;

        for (double w: notlar){
            if (w<ortalama){
                sayac++;
            }
        }

        System.out.println("Ortalama altinda not sayisi: " + sayac);




    }
}
