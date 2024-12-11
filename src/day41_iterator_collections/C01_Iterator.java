package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // sayilar listesindeki tum elemanlarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i <sayilar.size(); i++) {

            toplam+=sayilar.get(i);

        }

        System.out.println("elemanlarin toplami for loop : " + toplam);

        // INDEX KULLLANMADAN elemanlarin toplamini bulun

        toplam=0;

        for (Integer each : sayilar){
            toplam+=each;
        }

        System.out.println("Elemanlarim toplami for each : " + toplam);

        // sayilar listesindeki her elemani 1 arttirin

//        for (int i = 0; i < sayilar.size(); i++) {
//
//            int eskiDeger = sayilar.get(i);
//            sayilar.set(i,eskiDeger+1);
//        }

        // index kullanmadan

//        System.out.println(sayilar);
//
//        for (Integer each : sayilar){
//
//            sayilar.set(each,1);
//
//        }
//
//        System.out.println(sayilar);

        List<Integer> numaralar = new ArrayList<>(Arrays.asList(4,5,7,3,9));

        Iterator iterator = numaralar.iterator();

        System.out.println(iterator.hasNext()); // true, iternator'a daha eleman var mi diye sorar.

        System.out.println(iterator.next()); // 4, iterator'u bir sonraki konuma gecirir

        iterator.remove(); // uzerine aldigi elementi siler

        System.out.println(numaralar); // [5, 7, 3, 9]

        iterator.next();

        iterator.remove();

        System.out.println(numaralar); // [7, 3, 9]

//        iterator.remove(); // uzeirne aldigi 5'i 2 satir once sildi, uzerinde eleman kalmadi
        // calistirirsaniz illegalstateexception verir.





    }


}
