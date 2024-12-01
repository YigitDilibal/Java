package day20_multiDimensionalArrays;

import java.util.Arrays;

public class C03_BinarySearch {

    public static void main(String[] args) {


        //int[] arr = {3,11,5,0,8,2,9};

//System.out.println(Arrays.binarySearch(arr, 3));


        int arr[] = {12, 23, 12, 2, 3};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 5));

    }

}
