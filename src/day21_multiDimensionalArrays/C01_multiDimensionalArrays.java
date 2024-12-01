package day21_multiDimensionalArrays;

import java.util.Arrays;

public class C01_multiDimensionalArrays {

    public static void main(String[] args) {

        int a = 34;

        int[] b = {2,3,4};

        int[][] arr = { {2,3} , {3,6,9} , {1,4,9,5} , {1}};

        System.out.println(arr.length);

        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][1]);
        System.out.println(arr[3][0]);
        System.out.println(arr[3]); // [I@5f184fc6

        System.out.println(Arrays.toString(arr[1])); // [3, 6, 9]

        /*
        MultiDimensionalArray'lerde yazdirma islemi yapmadan once
        ne yazdirmak istedigimizi iyi belirlemeliyiz

        -Eger yazdiracagimiz sey en icerdeki elementlerden birisi ise
        direkt yazdirabiliriz.     System.out.println(arr[0][1]);

        -Eger inner array'lerden birini yazdirmak istiyorsak
        array yazdirmak istdigimiz icin (Arrays.toString(arr[1])

        -butun arrayi tek seferde yazdirmak istersek
        Arrays.deepToString(arr) kullanmaliyiz
         */

        System.out.println(Arrays.toString(arr));
        // [[I@3feba861, [I@5b480cf9, [I@6f496d9f, [I@5f184fc6]

        System.out.println(Arrays.deepToString(arr));
        // [[2, 3], [3, 6, 9], [1, 4, 9, 5], [1]]


    }
}
