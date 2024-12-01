package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,4,5,6,7,8,7,6,5,4,6,8,9,9,7,6,5,4,4,45,6,7,8,9,0,5};

        // arr'deki tum elementleri bir listeye aktarin

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);
        }

        System.out.println("Sayilar Listesi: " + sayilar);

        /*
        Arrays.asList() method'u tek satirda
        var olan bir array'i List'e donusturmemizi saglar
        AMMAAA 2 tane cok buyuk dezavantaji vardir.

        1- bu sekilde donusturulen bir List
           List olmasina ragmen add() ve remove() gibi
           uzunlugu degistiren methodlar KULLANAMAZ.

        2- Array ve Arrayden donusturulen liste ayni degerleri kullanir
        Array'e atama yaparsaniz list,
        Liste atama yaparsaniz array degisir

         */

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Method ile donusturulen Sayilar Listesi: " +arraydenList);
        // arraydenList.add(20); UnsupportedOperationException
        // arraydenList.remove(0); UnsupportedOperationException

        System.out.println("Array:\t\t\t\t\t "+Arrays.toString(arr));
        System.out.println("Method ile donusturulen: " +arraydenList);

        arr[0] = 20;
        arr[1] = 30;

        System.out.println("Arraya atama yaptiktan sonra Array:\t\t\t\t\t "+Arrays.toString(arr));
        System.out.println("Arraya atama yaptiktan sonra Method ile donusturulen: " +arraydenList);







    }

}
