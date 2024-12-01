package day22_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_BenzersizArrayOlusturma {

    public static void main(String[] args) {

        //Verilen bir array’de tekrar eden elementler icin,
        // tekrar edenleri silip,
        // tum elemanlardan sadece 1 tane yapip
        // bize dondurecek bir method olusturun.

        int[] arr = {1,2,3,4,1,1,1,2,2,3,4,4,4,3,3,2,1,5,5,5,5,5,4,2,3,4,2,2,5};

        System.out.println(Arrays.toString(BenzersizArray(arr)));


    }

    public static int[] BenzersizArray (int[]arr){

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }

        }
        arr=new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i]=tekrarsizList.get(i);

        }

        return arr;

    }

}
