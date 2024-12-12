package day42_collections_maps;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_ArraydenTekrarlariSilme {

    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elementleri silip
        // array'i elemanlarin sadece 1'er kez bulundugu hale getirin.

        int[] arr = {5,4,5,5,1,2,2,5,4,5,2,1,2,3,3,6,8,9,5,48,7,5,4,9,6};

        Set<Integer> sayilarSeti = new TreeSet<>();

        for (int each: arr){
            sayilarSeti.add(each);
        }

        System.out.println(sayilarSeti);

        arr = new int[sayilarSeti.size()];

        int index = 0;

        for (Integer each : sayilarSeti){
            arr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr));





    }






}
