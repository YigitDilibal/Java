package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // ListIterator kullanarak
        // sayilar listesindeki elemanlari 1'er artirin.

        ListIterator listIterator = sayilar.listIterator();

        while (listIterator.hasNext()){

            int eskiDeger = (int)listIterator.next();

            listIterator.set(eskiDeger+1);
        }

        System.out.println(sayilar);

        // list iterator kullanarak elemanlari sondan basa dogru yazdirin

        // iterator kullanirken dikkat edecegimiz 2 onemli nokta var
        // 1. while loop icinde sadece 1 kere iteration yapmak iterator.next, iterator.previous
        // 2. iterator'i nerede biraktik

        // su anda iterator sonda
        // iterator'i sondan basa dogru getirecek bir while loop olusturalim

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+ " ");
        }

        // listIterator ile listeyi gozden gecirip
        // tek sayilari 1 arttirin, cift sayilari 2 azaltin

        // iterator suan en basta

        while (listIterator.hasNext()){
            int deger = (int)listIterator.next();

            if (deger%2==0){
                listIterator.set(deger-2);
            }else {
                listIterator.set(deger+1);
            }


        }




    }





}
