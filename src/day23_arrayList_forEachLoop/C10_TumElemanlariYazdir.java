package day23_arrayList_forEachLoop;

import java.util.Arrays;

public class C10_TumElemanlariYazdir {

    public static void main(String[] args) {

        int[] arr = {3,78,34,98,1,34,67,43,78,11,84,45};

        for (int each: arr){
            System.out.print(each+" ");
        }

        System.out.println();
        Arrays.sort(arr);

        for (int each: arr){
            System.out.print(each+" ");
        }
        //1 3 11 34 34 43 45 67 78 78 84 98




    }
}
