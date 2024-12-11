package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_IteratorIleElemanSilme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // iterator ile tum elemenleri gozden gecirip
        // cift sayilari silin

        Iterator iterator = sayilar.iterator();

        iterator.hasNext();

        while (iterator.hasNext()){ // yaninda eleman oldugu surece isleme devam et

            int sayi = (Integer)iterator.next();

            if (sayi%2==0){
                iterator.remove();
            }

        }

        // iterator biz demeden hicbir hareket yapmaz.
        // yukaridaki islemi dusunecek olursak
        // iterator su an sonda
        // yeni bir islem yapmak istersek
        // iteratora yeniden deger atamaliyiz.

        iterator = sayilar.iterator();







    }


}
